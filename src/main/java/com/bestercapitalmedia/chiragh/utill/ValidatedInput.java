package com.bestercapitalmedia.chiragh.utill;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
/**
 * The Class ValidatedInput.
 */
@Service
public class ValidatedInput {
	
	/** The valid. */
	private Boolean valid = true;
	
	/** The validation messages. */
	private ArrayList<String> validationMessages = new ArrayList<>();
	
	/** The label. */
	// private String string;
	private String label;

	/**
	 * Instantiates a new validated input.
	 */
	public ValidatedInput() {
	}

	/**
	 * Validate text input.
	 *
	 * @param input the input
	 * @param min the min
	 * @param max the max
	 * @param required the required
	 * @return true, if successful
	 */
	public boolean validateTextInput(String input, int min, int max, boolean required) {

		if (required)
			required(input);
		alpha(input);
		min_length(input, min);
		max_length(input, max);
		return valid;
	}

	/**
	 * Validate user name.
	 *
	 * @param input the input
	 * @param min the min
	 * @param max the max
	 * @return true, if successful
	 */
	public boolean validateUserName(String input, int min, int max) {
		required(input);
		min_length(input, min);
		max_length(input, max);
		return valid;
	}
	
	/**
	 * Validate mobile no.
	 *
	 * @param input the input
	 * @param min the min
	 * @param max the max
	 * @return true, if successful
	 */
	public boolean validateMobileNo(String input, int min, int max) {
		required(input);
		 integer(input);
		min_length(input, min);
		max_length(input, max);
		return valid;
	}
	
	

	/**
	 * Validate email.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	public boolean validateEmail(String input) {
		required(input);
		email(input);
		return valid;
	}
	
	

	
	/**
	 * Check case.
	 *
	 * @param validationCase the validation case
	 * @param errorMessage the error message
	 */
	private void checkCase(Boolean validationCase, String errorMessage) {
		if (!validationCase) {
			this.valid = false;
			this.validationMessages.add(errorMessage.replace("*label*", "'" + label + "'"));
		}
	}

	/**
	 * Checks if the string has at least 1 character.
	 *
	 * @param input the input
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput required(String input) {
		this.checkCase(input.length() != 0, "*label* is required.");
		return this;
	}

	/**
	 * Checks if the string contains only upper or lower case letters or numbers.
	 *
	 * @param input the input
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput alphanum(String input) {
		this.checkCase(input.matches("^[a-zA-Z0-9]*$"), "*label* must include only letters and numbers.");
		return this;
	}

	/**
	 * Checks if the string contains only upper or lower case letters.
	 *
	 * @param input the input
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput alpha(String input) {
		this.checkCase(input.matches("^[a-zA-Z]*$"), "*label* must include only letters.");
		return this;
	}

	/**
	 * Checks if the string contains only numbers.
	 *
	 * @param input the input
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput integer(String input) {
		this.checkCase(input.matches("^[0-9]*$"), "*label* must be an integer.");
		return this;
	}

	/**
	 * Checks if the string length is more than given length.
	 *
	 * @param input the input
	 * @param length            length to be used in the validation
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput min_length(String input, Integer length) {
		this.checkCase(input.length() > length, "*label* must have more than " + length + " characters.");
		return this;
	}

	/**
	 * Checks if the string length is less than the given length.
	 *
	 * @param input the input
	 * @param length            length to be used in the validation
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput max_length(String input, Integer length) {
		this.checkCase(input.length() < length, "*label* must have less than " + length + " characters.");
		return this;
	}

	/**
	 * Checks if the string is a valid email (beta).
	 *
	 * @param input the input
	 * @return ValidatedInput instance with updated properties
	 */
	public ValidatedInput email(String input) {
		String emailRegex = "^[A-Z0-9._%+-]++@[A-Z0-9.-]++\\.[A-Z]{2,}+$";
		this.checkCase(input.matches(emailRegex), "*label* must be valid email.");
		return this;
	}

	/**
	 * Tells if the string meets the validations or not.
	 *
	 * @return true if all validations have passed successfully and false otherwise
	 */
	public Boolean isValid() {
		return valid;
	}

	/**
	 * Gives all validation error messages.
	 *
	 * @return ArrayList of validation error messages
	 */
	public ArrayList<String> getValidationMessages() {
		return validationMessages;
	}
}