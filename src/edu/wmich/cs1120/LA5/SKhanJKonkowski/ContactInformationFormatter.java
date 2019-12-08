package edu.wmich.cs1120.LA5.SKhanJKonkowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Date: 10/30/2019 CS1120-545 LA5 Objects of this class receive file paths and
 * print the information contained within them if its format is correct.
 * Otherwise, appropriate exceptions are thrown.
 * 
 * @author M. Salman Khan & Jake Konkowski
 *
 */
public class ContactInformationFormatter implements IContactInformationFormatter {

	Scanner file;
	FormatExceptionHandler handler = new FormatExceptionHandler();

	/**
	 * Passes every received file path (one by one) to formatContactInformation
	 * method
	 * 
	 * @param filePaths receives an array containing paths to files
	 */
	@Override
	public void readContactInformation(String[] filePaths) {
		for (int i = 0; i < filePaths.length; i++) {
			formatContactInformation(filePaths[i]);
		}
	}

	/**
	 * Checks file for existence and in case it does, every line from it is passed
	 * to an appropriate method for further processing. In case an exception is
	 * thrown, it is handled in this method
	 * 
	 * @param filename receives path to a single file
	 */
	@Override
	public void formatContactInformation(String fileName) {
		try {
			file = new Scanner(new File(fileName));
			try {
				formatName(file.nextLine());
			} catch (NameFormatException e) {
				handler.handleNameFormatException(e);
			}
			try {
				formatPhoneNumber(file.nextLine());
			} catch (PhoneNumberFormatException e) {
				handler.handlePhoneNumberFormatException(e);
			}
			try {
				formatEmail(file.nextLine());
			} catch (EmailAddressFormatException e) {
				handler.handleEmailFormatException(e);
			}
		} catch (FileNotFoundException e) {
			System.out.print(fileName);
			handler.handleFileNotFoundException(e);
		}
	}

	/**
	 * Checks name for format. In case it does not match requirements, an exception
	 * is thrown
	 * 
	 * @param name receives unprocessed name
	 * @throws NameFormatException if name received does not match format
	 */
	@Override
	public void formatName(String name) throws NameFormatException {
		if (name.matches("[A-Z][a-z]+[ ][A-Z][a-z]+"))
			System.out.println(name);
		else
			throw new NameFormatException(name.split(" "));
	}

	/**
	 * Checks phone number for format. In case it does not match requirements, an
	 * exception is thrown
	 * 
	 * @param phoneNumber receives unprocessed phone number
	 * @throws PhoneNumberFormatException if phone number received does not match
	 *                                    format
	 */
	@Override
	public void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
		if (phoneNumber.matches("(\\d{3})-\\d{3}-\\d{4}"))
			System.out.println(phoneNumber);
		else
			throw new PhoneNumberFormatException(phoneNumber);
	}

	/**
	 * Checks e-mail address for format. In case it does not match requirements, an
	 * exception is thrown
	 * 
	 * @param email receives unprocessed e-mail address
	 * @throws EmailAddressFormatException if e-mail address received does not match
	 *                                     format
	 */
	@Override
	public void formatEmail(String email) throws EmailAddressFormatException {
		if (email.matches("[a-z]([a-z])*(.[a-z]+)*@[a-z]+.(a-z)+"))
			System.out.println(email);
		else
			throw new EmailAddressFormatException(email);
	}
}
