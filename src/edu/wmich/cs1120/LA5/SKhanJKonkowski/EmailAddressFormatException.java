package edu.wmich.cs1120.LA5.SKhanJKonkowski;

/**
 * This exception is thrown when an e-mail address does not match the required
 * format.
 * 
 * @author M. Salman Khan & Jake Konkowski
 *
 */
public class EmailAddressFormatException extends Exception {
	
	private String email;

	/**
	 * Creates an object of the EmailAddressFormatException storing both parts of
	 * the wrongly formated e-mail address received
	 * 
	 * @param email receives wrongly formatted e-mail address
	 */
	public EmailAddressFormatException(String email) {
		this.email = email;
	}

	/**
	 * Gets email
	 * 
	 * @return wrongly formatted e-mail address
	 */
	public String getEmail() {
		return this.email;
	}

}
