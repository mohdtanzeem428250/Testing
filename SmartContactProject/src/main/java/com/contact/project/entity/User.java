package com.contact.project.entity;

import jakarta.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import java.util.List;
import java.util.ArrayList;
@Entity
@Table(name="USER")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message="Name Field Is Required")
	@Size(min=2,max=20,message="Min 2 And Max 20 Character Allowed")
	private String name;
	@Column(unique=true)
	private String email;
	private String password;
	private String role;
	private boolean enabled;
	private String image;
	@Column(length=500)
	private String about;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	public List<Contact> list=new ArrayList<>();
	
	public User()
	{
		super();
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getRole() 
	{
		return role;
	}
	public void setRole(String role) 
	{
		this.role = role;
	}
	public boolean isEnabled() 
	{
		return enabled;
	}
	public void setEnabled(boolean enabled) 
	{
		this.enabled = enabled;
	}
	public String getImage() 
	{
		return image;
	}
	public void setImage(String image) 
	{
		this.image = image;
	}
	public String getAbout() 
	{
		return about;
	}
	public void setAbout(String about) 
	{
		this.about = about;
	}
	public List<Contact> getList()
	{
		return list;
	}
	public void setList(List<Contact> list) 
	{
		this.list=list;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
				+ ", enabled=" + enabled + ", image=" + image + ", about=" + about + ", list=" + list + "]";
	}
	
}
