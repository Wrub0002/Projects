package fooditemsPkg;

import ServicesPkg.Deliverable;

/**
 * Represents a pizza that implements the Deliverable interface.
 */
public class Pizza implements Deliverable{

	private int size_in_inches;
	private String type_of_sauce;
	private boolean thin_crust;
	private boolean ham;
	private boolean pepperoni;
	private boolean extra_cheese;
	private boolean olives;
	private boolean mushrooms;
	private boolean green_pepper;
	private boolean tomatoes;
	private boolean onion;
 
	/**
     * Constructs a Pizza object with the specified size, sauce type, and crust type.
     * @param size_in_inches the size of the pizza in inches
     * @param type_of_sauce the type of sauce
     * @param thin_crust true if the pizza has thin crust, false otherwise
     */
	public Pizza (int size_in_inches, String type_of_sauce, boolean thin_crust) {
		this.size_in_inches = size_in_inches;	
		this.type_of_sauce = type_of_sauce;
        this.thin_crust = thin_crust;	  
	}
	/**
     * Constructs a Pizza object with the specified size and sauce type.
     * @param size_in_inches the size of the pizza in inches
     * @param type_of_sauce the type of sauce
     */
	public Pizza (int size_in_inches, String type_of_sauce) {
		this.size_in_inches = size_in_inches;
		this.type_of_sauce = type_of_sauce;
	}
	public void extraCheese() {
		extra_cheese = true;
	}
	public void addGreenPepper () {
		green_pepper = true;
	}
	public void addHam() {
		ham = true;
	}
	public void addMushrooms() {
		mushrooms = true;
	}
	public void addOlives() {
		olives = true;
	}
	public void addOnion() {
		onion = true;
	}
	public void addPepperoni() {
		pepperoni = true;
	}
	public void addTomatoes() {
		tomatoes = true;
	}
	public int getSize_in_inches() {
		return size_in_inches;
	}
	@Override
	public double getDeliveryCosts() {
	    if (size_in_inches == 12) {
	    	return 3.50;
	    } else if (size_in_inches == 14) {
	    	return 4.75;
	    } else {
	    	return 0.0;
	    }
	}
	/**
	 * Returns a string representation of the Pizza object.
	 *
	 * @return a string representing the Pizza object, including its size, type of sauce, and toppings
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(size_in_inches).append("inch");
		sb.append("pizza with").append(type_of_sauce).append (" sauce");
		if (thin_crust) sb.append("thin Crust ");
		if (ham) sb.append(", ham");
		if (pepperoni) sb.append(", pepperoni");
		if (extra_cheese) sb.append(", extra cheese");
		if (olives) sb.append(", Olives");
		if (mushrooms) sb.append(", mushrooms");
		if (green_pepper) sb.append(", Green Pepper");
		if (tomatoes) sb.append(", Tomatoes");
		if (onion) sb.append(", Onion");
		return sb.toString();
	}
}
