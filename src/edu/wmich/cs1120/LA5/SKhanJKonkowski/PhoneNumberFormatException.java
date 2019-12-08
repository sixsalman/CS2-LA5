package edu.wmich.cs1120.LA5.SKhanJKonkowski;

/**
 * This exception is thrown when a phone number does not match the required
 * format.
 * 
 * @author M. Salman Khan & Jake Konkowski
 *
 */
public class PhoneNumberFormatException extends Exception {

	private String phoneNumber;

	/**
	 * Creates an object of the PhoneNumberFormatException storing both parts of the
	 * wrongly formated phone number received
	 * 
	 * @param phoneNumber receives wrongly formatted phone number
	 */
	public PhoneNumberFormatException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets phone number
	 * 
	 * @return wrongly formatted phone number
	 */
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

}