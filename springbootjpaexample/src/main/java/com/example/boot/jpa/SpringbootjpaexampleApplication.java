package com.example.boot.jpa;
import com.example.boot.jpa.UserDao.UserRepository;
import com.example.boot.jpa.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringbootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		User user=new User();
		user.setName("Tanzeem");
		user.setEmail("mtanzeem115@gmail.com");
		user.setCity("Bareilly");
		userRepository.save(user);
		System.out.println(user);
	}

}
