package deliverableTestPkg;

import ServicesPkg.Deliverable;
import fooditemsPkg.Pizza;
import fooditemsPkg.SudsOrder;

/**
 * class to create some instances of Deliverable and process them polymorphically. 
 * Ensure that you clean up your code and add comments to show good coding practices.
 * @author Leonardo Wrubleski
 *
 */
public class Starter_DeliverableTest {
	final static boolean ThinCrust=true;
	/**
     * Main method to test Deliverable interface implementations.
     * @param args command line arguments
     */
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(12, "pesto", ThinCrust);
		pizza1.addMushrooms();
		pizza1.addOnion();
		pizza1.addOlives();
		pizza1.addGreenPepper();
		
		Pizza pizza2 = new Pizza(14, "marinara");
		pizza2.addPepperoni();
		pizza2.addMushrooms();
		pizza2.addGreenPepper();
		pizza2.extraCheese();
		
		SudsOrder sudsOrder1 = new SudsOrder("Rollicking Root Beer ",6, 473);
        SudsOrder sudsOrder2 = new SudsOrder("Super Citrus Fizz ",4, 473);

        Deliverable[] deliverableItems = { pizza1, pizza2, sudsOrder1, sudsOrder2 };

        System.out.println("Item\t\t\t\t\tNumber/Size\t\tCost");
        System.out.println("-------------------------------------------------------------------------------");
        for (Deliverable item : deliverableItems) {
            if (item instanceof SudsOrder) {
                SudsOrder sudsOrder = (SudsOrder) item;
                System.out.printf("%-30s\t\t%d\t\t\t$%.2f\n", sudsOrder.getName(), sudsOrder.getNumber(), sudsOrder.getDeliveryCosts());
            } else if (item instanceof Pizza) {
                Pizza pizza = (Pizza) item;
                System.out.printf("%-30s\t\t%d\t\t\t$%.2f\n", "Pizza", pizza.getSize_in_inches(), pizza.getDeliveryCosts());
            }
        }
    }
}