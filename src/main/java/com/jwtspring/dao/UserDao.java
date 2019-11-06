package com.jwtspring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jwtspring.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer>{
	
	UserDao findByUsername(String username);
	
}
