package fooditemsPkg;

import ServicesPkg.Deliverable;

/**
 * Represents a suds order that implements the Deliverable interface.
 */
public class SudsOrder implements Deliverable {
	private String name;
	private int number;
	private int size_in_ml;
	/**
     * Constructs a SudsOrder object with the specified name, number, and size in ml.
     * @param name the name of the suds order
     * @param number the number of suds ordered
     * @param size_in_ml the size of each sud in milliliters
     */
	public SudsOrder(String name, int number, int size_in_ml) {
		this.name = name;
		this.number = number;
		this.size_in_ml = size_in_ml;
	}
	/**
     * Returns the name of the suds order.
     * @return the name of the suds order
     */
	public String getName() {
		return name;
	}
	/**
     * Returns the number of suds ordered.
     * @return the number of suds ordered
     */
	public int getNumber() {
		return number;
	}
	/**
     * Returns the size of each sud in milliliters.
     * @return the size of each sud in milliliters
     */
	public int getSize_in_ml() {
		return size_in_ml;
	}

    /**
     * Calculates the delivery cost of the suds order.
     * @return the delivery cost of the suds order
     */
    @Override
    public double getDeliveryCosts() {
        // Calculate delivery cost for beverage
        // Example: $0.75 per can
        return 0.75 * number;
    }

    /**
     * Returns a string representation of the SudsOrder object.
     * @return a string representation of the SudsOrder object
     */
    @Override
    public String toString() {
        return number + "x" + size_in_ml + "ml" + name;
    }
}

