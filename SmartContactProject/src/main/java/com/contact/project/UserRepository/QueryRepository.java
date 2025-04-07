package com.contact.project.UserRepository;

import org.springframework.data.jpa.repository.*;
import com.contact.project.entity.Query;
public interface QueryRepository extends JpaRepository<Query,Long>
{
	public Query findByid(Long id);
}
