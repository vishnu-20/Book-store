package com.fdmgroup.bookstore;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.fdmgroup.bookstore.data.UserArrayListRepository;
import com.fdmgroup.bookstore.model.User;

@SpringBootTest
class BookStoreApplicationTests {

	@InjectMocks
	private UserArrayListRepository arrayListRepository;

	@Test
	public void validateTest() {

		boolean actual = arrayListRepository.validate("Vishnu-20", "Vishnu@123");
		Assertions.assertEquals(true, actual);
	}

	@Test
	public void validateFailTest() {

		boolean actual = arrayListRepository.validate("Vishnu-20", "Vishnu@12366");
		Assertions.assertEquals(false, actual);
	}

	@Test
	public void deleteTest() {
		User user = new User(3, "Vishnu", "Lal", "Vishnu-202", "Vishnu@123", "vishnulal@gmail.com", null);

		arrayListRepository.delete(user);

	}

	@Test
	public void generateIdTest() {

		Integer actual = arrayListRepository.generateId();
		Assertions.assertNotNull(actual);
		;
	}

	@Test
	public void findByidTest() {
		User user = new User(1, "Vishnu", "Lal", "Vishnu-20", "Vishnu@123", "vishnulal@gmail.com", null);

		User actual = arrayListRepository.findById(1);
		Assertions.assertEquals(user, actual);
	}

	@Test
	public void findByUsernameTest() {

		User user = new User(3, "Vishnu", "Lal", "Vishnu-20", "Vishnu@123", "vishnulal@gmail.com", null);

		User actual = arrayListRepository.findByUsername("Vishnu-20");
		Assertions.assertEquals(user, actual);
	}

	@Test
	public void findByUsernameNotTest() {

		User user = null;

		User actual = arrayListRepository.findByUsername("Vishnu-20");
		Assertions.assertNotEquals(user, actual);
	}

	@Test
	public void findAll() {
		List<User> users = new ArrayList<>();
		User user = new User(1, "Vishnu", "Lal", "Vishnu-20", "Vishnu@123", "vishnulal@gmail.com", null);
		User user1 = new User(2, "Vishnu", "Lal", "Vishnu-201", "Vishnu@123", "vishnulal@gmail.com", null);

		users.add(user1);
		users.add(user);

		List<User> actual = arrayListRepository.findAll();
		Assertions.assertNotNull(actual);
	}

	@Test
	public void save() {
		User user = new User(3, "Vishnu", "Lal", "Vishnu-202", "Vishnu@123", "vishnulal@gmail.com", null);
		User actual = arrayListRepository.save(user);
		Assertions.assertEquals(user, actual);
	}

}
