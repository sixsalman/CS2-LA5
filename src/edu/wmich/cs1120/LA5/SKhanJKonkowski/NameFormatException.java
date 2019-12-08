package edu.wmich.cs1120.LA5.SKhanJKonkowski;

/**
 * This exception is thrown when a name does not match the required format.
 * 
 * @author M. Salman Khan & Jake Konkowski
 *
 */
public class NameFormatException extends Exception {

	private String[] name;

	/**
	 * Creates an object of the NameFormatException storing both parts of the
	 * wrongly formated name received
	 * 
	 * @param name receives name parts in wrong format
	 */
	public NameFormatException(String[] name) {
		this.name = name;
	}

	/**
	 * Gets name array
	 * 
	 * @return name array containing both parts of wrongly formatted name
	 */
	public String[] getName() {
		return this.name;
	}

}
