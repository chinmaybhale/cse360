/**
 * Written by:	Chinmay Bhale
 * 				cvbhale@asu.edu
 * 				1216362121
 * 
 * AddingMachine.java:	This class has a param total which stores the 
 * 						running total of all the calculations done on it
 * 						The class can also return the total, or return a 
 * 						String of the total. The class also has a method
 * 						to clear the total.
 * 
 * 	Subject:			CSE360, Friday, 10:40 am
 * 
 * @author Chinmay Bhale 
 */

package cse360assign2;

public class AddingMachine {

	private int total;
	
	/**
	 * Constructor, no params, sets value of total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getter method for total
	 * @return	the integer value of total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the value to the total
	 * @param value this is added to the total
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the value from the total
	 * @param value this is subtracted from the total
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Converts the value of total to string and returns it
	 * 
	 * @return the string value of total
	 */
	public String toString () {
		return "";
	}

	/**
	 * clears the value of total
	 */
	public void clear() {
	
	}
}
