package cse360assignment02;
/**
 * This class implements an adding machine
 * @author josia
 * total is the int to be used to keep track of the total
 * history will give us a wall of keeping track of all the additions and subtractions
 *Version 1.0
 */
public class AddingMachine {
  private int total;
  private String history = "0";
  
  /**
   * This begins the adding machine
   */
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * This returns the total of the summation
   * @return returns the total
   */
  
  public int getTotal () {
    return total;
  }
  
  /**
   * This adds a value to the total
   * @param value the value to be added
   * history gets updated that addition was used, and by how much
   */
  
  public void add (int value) {
	  total = value + total;
	  history = history + " + " + value;
  }
  
  /**
   *  This subtracts a value from the total
   * @param value the value to be subtracted
   * history is updated with the new subtraction
   */

  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + value;
  }
  
  /**
   * Returns the history as a string
   */

  public String toString () {
    return history;
  }
  
  /**
   * Clears the adding machine
   */

  public void clear() {
  }
}
