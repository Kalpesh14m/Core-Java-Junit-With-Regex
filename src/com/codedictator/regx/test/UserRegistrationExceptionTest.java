package com.codedictator.regx.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codedictator.regx.UserRegistration;
import com.codedictator.regx.exception.UserRegistrationException;

public class UserRegistrationExceptionTest {
	private UserRegistration user;

	@Before
	public void UserRegistrationObj() {
		user = new UserRegistration();
	}

	@Test
	public void testFirstName_thenAssertionSucceeds() {
		try {
			assertTrue(user.isValidateFirstName("Kalpesh"));
			System.out.println("Valid First Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testFirstName_thenAssertionFail() {
		try {
			assertTrue(user.isValidateFirstName("bunny"));
			System.out.println("Valid First Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastName_thenAssertionSucceeds() {
		try {
			assertTrue(user.isValidateLastName("Mahajan"));
			System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastName_thenAssertionFail() {
		try {
			assertTrue(user.isValidateLastName("devil"));
			System.out.println("Valid Last Name");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmail_thenAssertionSucceeds() {
		try {
			assertTrue(user.isValidateEmail("abc@gmail.com"));
			System.out.println("Valid Email");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmail_thenAssertionFail() {
		try {
			assertTrue(user.isValidateEmail("abc@gmail@.com@"));
			System.out.println("Valid Email");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testMobileNumber_thenAssertionSucceeds() throws UserRegistrationException {
		assertTrue(user.isValidateMobileNumber("9876543210"));
		System.out.println("Valid Mobile Number");

	}

	@Test
	public void testMobileNumber_thenAssertionFail() {
		try {
			assertTrue(user.isValidateMobileNumber("91 0876543210"));
			System.out.println("Valid Mobile Number");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds() {
		try {
			assertTrue(user.isValidatePassword("Abcd@1234"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds1() {
		try {
			assertTrue(user.isValidatePassword("Abcdefg@"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds2() {
		try {
			assertTrue(user.isValidatePassword("1221212234"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionSucceeds3() {
		try {
			assertTrue(user.isValidatePassword("Ab@1234@@"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPassword_thenAssertionFail() {
		try {
			assertTrue(user.isValidatePassword("bbb"));
			System.out.println("Valid Password");
		} catch (UserRegistrationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(expected = UserRegistrationException.class)
	public void whenUserRegistrationExceptionThrown_thenAssertionSucceeds() throws UserRegistrationException {
		assertTrue(user.isValidatePassword("bbb"));
	}

	@After
	public void nullObj() {
		user = null;
	}
}
