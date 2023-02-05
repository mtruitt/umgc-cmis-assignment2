/**
 * Mark Truitt
 * CMIS 242 - Assignment 2: Inheritance and Encapsulation
 * 2023/02/05
 *
 * This class is a subclass of Snack and represents a SaltySnack
 * It adds an attribute of nut which indicates if the snack includes a salty snack
 * The price is calculated by adding a fee of $4.50 if it has a salty snack
 */

import java.lang.Math;

public class SaltySnack extends Snack {
    // attributes
    private boolean nut;
    private final double NUT_PRICE = 4.50;

    // Constructor to create a SaltySnack object, with a size and a nut flag
    public SaltySnack(String size, boolean nut) {
        // Call the super class's constructor to set the size of the snack
        super(size);
        // Set the nut flag for this salty snack object
        this.nut = nut;
    }

    // Override the getPrice method to return the price of the snack
    @Override
    public double getPrice() {
        // Get the price of the snack from the super class
        double price = super.getPrice();
        // If the nut flag is set, add the NUT_PRICE to the price
        if (nut) {
            price += NUT_PRICE;
        }
        // Return the final price, rounded to 2 decimal places
        return (double) Math.round(price * 100) / 100;
    }

    // Override the toString method to return a string representation of the snack object
    @Override
    public String toString() {
        return "SaltySnack{" +
                "id='" + super.getId() + '\'' +
                ", size=" + super.getSize() +
                ", price=" + getPrice() +
                ", nut=" + nut +
                '}';
    }

}
