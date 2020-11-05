package com.codedictator.regx.constants;

public class RegexConstants {
	private RegexConstants() {
	}

	public static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	public static final String MOBILE_NUMBER_REGEX = "[0-9]{2}\\s[1-9]{1}[0-9]{9}";
	public static final String PASSWORD_REGEX = "^(?=.*[!@#$%^&*|'<>.-^*()%!])(?=.*[0-9])(?=.*[A-Z])[^\\s]{8,}$";
	public static final String MOBILE_NUMBER_INVALID_MSG = "Mobile Number Not valid";

}
