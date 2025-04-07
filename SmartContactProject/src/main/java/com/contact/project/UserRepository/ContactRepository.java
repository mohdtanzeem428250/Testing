package com.contact.project.UserRepository;
import java.util.List;
import com.contact.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.contact.project.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//@EnableJpaRepositories
public interface ContactRepository extends JpaRepository<Contact,Integer>
{
	@Query("from Contact as c where c.user.id =:userId")
	public Page<Contact> findContactsByUser(@Param("userId")int userId, Pageable pageable);
//	public List<Contact> findByNameContainingAndUser(String name,User user); 
}
