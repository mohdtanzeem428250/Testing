console.log("This is Js File");

const toggleSideBar=()=>
	{
		if($(".sidebar").is(":visible"))
			{
				$(".sidebar").css("display","none");
				$(".content").css("margin-left","0%");
			}
		else
		{
			$(".sidebar").css("display","block");
			$(".content").css("margin-left","20%");
		}
	};
const search=()=>
	{
		console.log("Searching...");
		let query=$("#search-input").val();
		if(query=="")
			{
				$(".search-result").hide();
			}
			else
			{
				console.log(query);
				let url=`http://localhost:8082/search/${query}`;
				fetch(url).then((response)=>{
					return response.json();
				}).then((data)=>{
					console.log(data);
					let text=`<div class='list-group'>`;
					data.forEach((contact)=>
					{
						text+=`<a href='/user/contact/${contact.Id}' class='list-group-item list-group-list-action'>${contact.name}</a>`
					});
					text+=`</div>`;
					$(".search-result").html(text);
					$(".search-result").show();
				});
			}
	};
	//const i=document.getElementById("payment_field");
	const paymentStart=()=>
	{
		console.log("Payment Starting");   
		let amount=$("#payment_field").val();
		console.log(amount);
		if(amount=="" || amount==null)
		{ 
			alert("Amount Is Required");   
			return;
		}
		jQuery.ajax
	    	({
			url:'/user/create_order',
			data:JSON.stringify({amount:amount,info:'order_request'}),	        
			contentType:'application/json',	        
			type:'POST',	        
			dataType:'json',	        
			success:function(response)        		
			{	           
				console.log(response);	   
				if(response.status=='created')
					{
						let options=
						{
							key:'rzp_test_AD9TqbCPT4a9ul',
							amount:response.amount,
							currency:'INR',	
							name:'Smart Contact Manager',
							description:'Donation',
							image:'/img/paytm.png',
							order_id:response.id,
							handler:function(response)
							{
								console.log("Payment Successfully");
								console.log(response.razorpay_payment_id);
								console.log(response.razorpay_order_id);
								console.log(razorpay_signature);
								//alert("Congratulations! Payment Successful");
								updatePaymentOnServer(response.razorpay_payment_id,response.razorpay_order_id,"paid");
								swal("Good Job!","Congratulation, Payment Successfully","success");
							},
							"prefill":
							{
								"name":"",
								"email":"",
								"contact":""
							},
							"notes":
							{
								"address":"Coding Seekho Aur Seekhao"
							},
							theme:
							{
								color:"#3399cc"
							},
						};
						let rzp=new Razorpay(options);
						rzp.on("payment.failed",function(response)
						{
							console.log(response.error.code);
							console.log(response.error.description);
							console.log(response.error.source);
							console.log(response.error.step);
							console.log(response.error.reason);
							console.log(response.error.metadata.order_id);
							console.log(response.error.metadata.payment_id);
							swal("Failed!","Oops Payment Failed...","error");
						});
						rzp.open();
					}    
			},	        
			error:function(error)	        	
			{	            
				console.log(error);	            
				alert("Something Went Wrong");	        
			}
		});

	};
	
	function updatePaymentOnServer(payment_id,order_id,status)
	{
		$.ajax
		({
			url:'/user/update_order',
			data:JSON.stringify({payment_id:payment_id,order_id:order_id,status:status}),	        
			contentType:'application/json',	        
			type:'POST',	        
			dataType:'json',
			success:function(response)
			{
				swal("Good Job!","Congratulation, Payment Successfully","success");
			},
			error:function(error)
			{
				swal("Failed!","Your Payment is Successfully, But We Did Not Get OnServer, We Will Contact You As Soon As Possible","error");
			}
		});
	}
	
