/**
 * Mark Truitt
 * CMIS 242 - Assignment 2: Inheritance and Encapsulation
 * 2023/02/05
 *
 * This class is a subclass of Snack and represents a FruitSnack
 * It adds an attribute of citrus which indicates if the snack includes a citrus fruit
 * The price is calculated by adding a fee of $5.99 if it has a citrus fruit
 */

import java.lang.Math;

public class FruitSnack extends Snack {
    // attributes
    private boolean citrus;
    private final double CITRUS_PRICE = 5.99;

    // Constructor that accepts the size of the snack and if it includes a citrus fruit
    public FruitSnack(String size, boolean citrus) {
        // Calls the constructor of the superclass Snack with the size parameter
        super(size);
        // Initializes the citrus attribute
        this.citrus = citrus;
    }

    // Overrides the getPrice method of the superclass to add the citrus fee if applicable
    @Override
    public double getPrice() {
        // Gets the price from the superclass
        double price = super.getPrice();
        // If the snack includes a citrus fruit, adds the fee to the price
        if (citrus) {
            price += CITRUS_PRICE;
        }
        // Returns the price rounded to two decimal places
        return (double) Math.round(price * 100) / 100;
    }

    // Returns a string representation of the FruitSnack object
    @Override
    public String toString() {
        return "FruitSnack{" +
                "id='" + super.getId() + '\'' + // Gets the id from the superclass
                ", size=" + super.getSize() + // Gets the size from the superclass
                ", price=" + getPrice() + // Gets the price from the getPrice method of this class
                ", citrusFruit=" + citrus + // The value of the citrus attribute
                '}';
    }
}