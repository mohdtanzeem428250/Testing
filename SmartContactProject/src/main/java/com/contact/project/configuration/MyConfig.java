package com.contact.project.configuration;
import org.springframework.context.annotation.Bean;
import com.contact.service.EmailService;
import org.springframework.context.annotation.Configuration;
//import com.contact.project.configuration.UserDetailsServiceImplements;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
@Order(1)
public class MyConfig
{
	@Bean
	public UserDetailsService getUserDetailsService()
	{
		return new UserDetailsServiceImplements();
	}
	@Bean 
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Bean
	public DaoAuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(this.getUserDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
	protected void configure(AuthenticationManagerBuilder authentication) throws Exception
	{
		authentication.authenticationProvider(authenticationProvider());
	} 
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().requestMatchers("/admin/**").hasRole("ADMIN")
			.requestMatchers("/user/**").hasRole("USER")
			.requestMatchers("/**").permitAll().and().formLogin()
//			.loginPage("/signin")
//			.loginProcessingUrl("/dologin")
//			.defaultSuccessUrl("/user/index")
//			.failureUrl("/login_fail")
			.and().csrf().disable();
		return http.build();
	}
	@Bean
	public EmailService emailService()
	{
		return new EmailService();
	}
//	@Bean
//	public EmailService emailService()
//	{
//		return new EmailService();
//	}
//	JavaMailSender
	
}
