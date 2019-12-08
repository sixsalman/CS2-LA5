package edu.wmich.cs1120.LA5.SKhanJKonkowski;

import java.io.FileNotFoundException;

/**
 * Objects of this class handle caught (format mismatch and absent file)
 * exceptions and print the information obtained, from file (in case it exists),
 * in appropriate format.
 * 
 * @author M. Salman Khan & Jake Konkowski
 *
 */
public class FormatExceptionHandler implements IFormatExceptionHandler {

	/**
	 * Tells user that no file matched the obtained name
	 * 
	 * @param e receives a FileNotFoundException object
	 */
	@Override
	public void handleFileNotFoundException(FileNotFoundException e) {
		System.out.println(" (The system cannot find the file specified)");
	}

	/**
	 * Prints every character of name (one by one) in the appropriate case from name
	 * String obtained from e
	 * 
	 * @param e receives a NameFormatException object
	 */
	@Override
	public void handleNameFormatException(NameFormatException e) {
	    StringBuffer fullNameBuffer = new StringBuffer();

	    String[] frags = e.getName();
	    for (String name : frags) {
	        fullNameBuffer
	        .append(name.substring(0, 1).toUpperCase())
	        .append(name.substring(1).toLowerCase())
	        .append(" ");
	    }

	    String fullName = fullNameBuffer.toString().trim();
	    
	    System.out.println(fullName);
	}

	/**
	 * Separates all digits from phoneNumber String obtained from e before adding
	 * parenthesis and dashes
	 * 
	 * @param e receives a PhoneNumberFormatException object
	 */
	@Override
	public void handlePhoneNumberFormatException(PhoneNumberFormatException e) {
		StringBuffer phoneNumberBuffer = new StringBuffer();
		String phoneNumber = e.getPhoneNumber();
		
		for (Character digit : phoneNumber.toCharArray()) {
			if (Character.isDigit(digit)) {
				phoneNumberBuffer.append(digit.toString());
			}
		}
		
		String fixedNumber = phoneNumberBuffer.toString();
		System.out.printf("(%s)-%s-%s\n",
				fixedNumber.substring(0,3),
				fixedNumber.substring(3, 6),
				fixedNumber.substring(6));
	}

	/**
	 * Prints email String obtained from e in lower case
	 * 
	 * @param e receives an EmailAddressFormatException
	 */
	@Override
	public void handleEmailFormatException(EmailAddressFormatException e) {
		System.out.println(e.getEmail().toLowerCase());
	}

}
