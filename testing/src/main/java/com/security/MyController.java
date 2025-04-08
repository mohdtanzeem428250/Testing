package com.security;
import org.springframework.stereotype.Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MyController 
{
	@RequestMapping("/home")

	public String home()
	{
		return "index";
	}
	@RequestMapping("/process")
	public String process(@RequestParam("email") String email,@RequestParam("password") String password) throws SQLException, ClassNotFoundException
	{
		System.out.println(email);
		System.out.println(password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tanzeem");
		PreparedStatement ps=connection.prepareStatement("insert into student values(?,?)");
		ps.setString(1,email);
		ps.setString(2,password);
		int c=ps.executeUpdate();
		if(c>0) 
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("failed");
		}
		return "index";
	}
}
