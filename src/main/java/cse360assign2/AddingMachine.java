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
	private String history;
	
	/**
	 * Constructor, no params, sets value of total to 0
	 */
	public AddingMachine () {
		this.total = 0;  // not needed - included for clarity
		this.history = new String("0");
	}
	
	/**
	 * getter method for total
	 * 
	 * @return	the integer value of total
	 */
	public int getTotal () {
		return this.total;
	}
	
	/**
	 * Adds the value to the total
	 * @param value this is added to the total
	 */
	public void add (int value) {
		this.total += value;
		this.history += " + " + String.valueOf(value);	
	}
	
	/**
	 * Subtracts the value from the total
	 * @param value this is subtracted from the total
	 */
	public void subtract (int value) {
		this.total -= value;
		this.history += " - " + String.valueOf(value);
	}
	
	/**
	 * Returns the history of all the operations performed
	 * on total
	 * 
	 * @return a string listing all the operations
	 */
	public String toString () {
		return this.history;
	}

	/**
	 * clears the value of total
	 */
	public void clear() {
		this.total = 0;
		this.history = "0";
	}
}
