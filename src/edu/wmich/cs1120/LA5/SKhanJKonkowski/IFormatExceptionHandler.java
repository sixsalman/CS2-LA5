package edu.wmich.cs1120.LA5.SKhanJKonkowski;

import java.io.FileNotFoundException;

/**
 * This interface has (entirely) been copied from the assignment paper (as per
 * instructions).
 * 
 * @author Assignment Writer
 *
 */
public interface IFormatExceptionHandler {

	void handleFileNotFoundException(FileNotFoundException e);

	/* Handle file not found exception */
	void handlePhoneNumberFormatException(PhoneNumberFormatException e);

	/* Handle phone number format exception */
	void handleEmailFormatException(EmailAddressFormatException e);

	/* Handle email format exception */
	void handleNameFormatException(NameFormatException e);
	/* Handle name format exception */

}
