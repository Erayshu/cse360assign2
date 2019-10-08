//***********************************
//Name: Vincent Le
//Class: CSE 360
//Assignment: cse360assign2
//Description: Simple addition and subtraction machine that will return
//			calculated value and equation generated.
//***********************************


package cse360assign2;

/**
 * 
 * @author Vincent Le
 * @param total (int) Total number in adding machine.
 * @param history (String) Equation built by commands used in adding machine.
 */
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Constructor initializing total.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Method to return total in adding machine.
	 * @return Total number in adding machine.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to total.
	 * @param value Inputed integer to be added to total.
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts value from total.
	 * @param value Inputed integer to be subtracted from total.
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
		
	/**
	 * Method to return history of commands as an equation.
	 * @return History of all commands.
	 */
	public String toString () {
		return history;
	}

	/**
	 * Method to erase history and reset adding machine.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
