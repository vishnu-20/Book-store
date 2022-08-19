package com.fdmgroup.bookstore.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fdmgroup.bookstore.model.User;

public class UserArrayListRepository implements UserRepository {

	public static Integer id = 0;
	private List<User> users;

	public UserArrayListRepository() {
		

	}

	public UserArrayListRepository(List<User> users) {
		super();
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public boolean validate(String userName, String password) {
		addToList();
		Long count = this.users.stream().filter(
				user -> user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equalsIgnoreCase(password))
				.count();
		return count > 0 ? true : false;
	}

	@Override
	public User findByUsername(String userName) {
		addToList();
		List<User> existinguser = this.users.stream().filter(user -> user.getUserName().equalsIgnoreCase(userName))
				.collect(Collectors.toList());

		return existinguser != null ? existinguser.get(0) : null;
	}

	public void addToList() {
		this.users = new ArrayList<>();
		User user = new User(generateId(), "Vishnu", "Lal", "Vishnu-20", "Vishnu@123", "vishnulal@gmail.com", null);
		User user1 = new User(generateId(), "Vishnu", "Lal", "Vishnu-201", "Vishnu@123", "vishnulal@gmail.com", null);

		this.users.add(user1);
		this.users.add(user);
	}

	public Integer generateId() {
		id = id + 1;
		return id;
	}

	@Override
	public User save(User user) {
		addToList();
		user.setUserId(generateId());
		users.add(user);
		return user;
	}

	@Override
	public void delete(User user) {
		addToList();
		List<User> existinguser = this.users.stream()
				.filter(userVal -> !userVal.getUserName().equalsIgnoreCase(user.getUserName()))
				.collect(Collectors.toList());

		this.setUsers(existinguser);

	}

	@Override
	public User findById(Integer id) {
		addToList();
		List<User> existinguser = this.users.stream().filter(userVal -> userVal.getUserId() == id)
				.collect(Collectors.toList());
		return existinguser != null ? existinguser.get(0) : null;
	}

	@Override
	public List<User> findAll() {
		addToList();
		return this.users;
	}

}
