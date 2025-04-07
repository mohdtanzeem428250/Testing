package com.contact.project.UserRepository;
import com.contact.project.entity.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MyOrderRepoository extends JpaRepository<MyOrder,Long> 
{
	public MyOrder findByorderId(String orderId);
}
