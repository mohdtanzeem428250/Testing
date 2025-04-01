package com.example.boot.jpa.UserDao;

import org.springframework.data.repository.CrudRepository;
import com.example.boot.jpa.entity.User;
public interface UserRepository extends CrudRepository<User, Integer>
{

}
