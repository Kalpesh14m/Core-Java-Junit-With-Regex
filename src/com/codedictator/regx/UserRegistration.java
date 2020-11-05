package com.codedictator.regx;

import java.util.regex.Pattern;

import com.codedictator.regx.constants.RegexConstants;
import com.codedictator.regx.exception.UserRegistrationException;

public class UserRegistration {

	public boolean isValidateFirstName(String firstName) throws UserRegistrationException {
		if (!validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX))
			throw new UserRegistrationException("Invalid First name");
		return true;
	}

	public boolean isValidateLastName(String lastName) throws UserRegistrationException {
		if (!validateRegex(lastName, RegexConstants.LAST_NAME_REGEX))
			throw new UserRegistrationException("Invalid Last name");
		return true;
	}

	public boolean isValidateEmail(String email) throws UserRegistrationException {
		if (!validateRegex(email, RegexConstants.EMAIL_ID_REGEX))
			throw new UserRegistrationException("Invalid Email Id");
		return true;
	}

	public boolean isValidateMobileNumber(String mobileNumber) throws UserRegistrationException {
		if (!validateRegex(mobileNumber, RegexConstants.MOBILE_NUMBER_REGEX))
//			throw new UserRegistrationException(RegexConstants.MOBILE_NUMBER_INVALID_MSG);
			return false;
		return true;
	}

	public boolean isValidatePassword(String password) throws UserRegistrationException {
		if (!validateRegex(password, RegexConstants.PASSWORD_REGEX))
			throw new UserRegistrationException("Invalid Password");
		return true;
	}

	private boolean validateRegex(String request, String pattern) {
		return Pattern.compile(pattern).matcher(request).matches() ? true : false;
	}
}
