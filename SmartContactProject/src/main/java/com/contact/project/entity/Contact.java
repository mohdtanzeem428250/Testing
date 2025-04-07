package com.contact.project.entity;
import jakarta.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
@Entity
@Table(name="CONTACT")
public class Contact 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contactId;
	private String firstname;
	private String secondname;
	private String work;
	private String email;
	private String phone;
	private String image;
	@Column(length=500)
	private String description;
	
	@ManyToOne
	@JsonIgnore
	private User user;
	
	public User getUser() 
	{
		return user;
	}

	public void setUser(User user) 
	{
		this.user = user;
	}

	
	public Contact()
	{
		super();
	}

	public int getContactId() 
	{
		return contactId;
	}

	public void setContactId(int contactId) 
	{
		this.contactId = contactId;
	}

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public String getSecondname() 
	{
		return secondname;
	}

	public void setSecondname(String secondname) 
	{
		this.secondname = secondname;
	}

	public String getWork() 
	{
		return work;
	}

	public void setWork(String work) 
	{
		this.work = work;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getImage() 
	{
		return image;
	}
	public void setImage(String image) 
	{
		this.image = image;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", firstname=" + firstname + ", secondname=" + secondname + ", work="
				+ work + ", email=" + email + ", phone=" + phone + ", image=" + image + ", description=" + description + "]";
	}

}
