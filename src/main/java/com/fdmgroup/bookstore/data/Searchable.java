package com.fdmgroup.bookstore.data;

import java.util.List;

import com.fdmgroup.bookstore.model.User;

public interface Searchable {

	User findById(Integer id); 
	List<User> findAll();
}
