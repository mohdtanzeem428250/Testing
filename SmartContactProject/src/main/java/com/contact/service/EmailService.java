package com.contact.service;
import org.springframework.stereotype.Service;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;
@Service
public class EmailService 
{
	public boolean sendEmail(String message,String subject,String to,String from)
	{
		String host="smtp.gmail.com";
		Properties properties=System.getProperties();
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.starttls.enable",true);
		properties.put("mail.smtp.auth",true);
		
		Session session=Session.getInstance(properties,new Authenticator() 
		{
			@Override
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication("mtanzeem115@gmail.com","GENERATED_PASSWORD");
			}
		});
		session.setDebug(true);
		MimeMessage m=new MimeMessage(session);
		try
		{
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			m.setContent(message,"text/html");
			m.setSubject(subject);
			Transport.send(m);
			System.out.println("Send Success.........");
			return true;
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return false;
	}
}
