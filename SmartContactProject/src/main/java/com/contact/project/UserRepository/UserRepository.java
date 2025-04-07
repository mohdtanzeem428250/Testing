package com.contact.project.UserRepository;
import com.contact.project.entity.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
//@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer>
{
	@Query("select u from User u where u.email= :email")
	public User getUserByUserName(@Param("email") String email);
}
