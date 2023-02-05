/**
 * Mark Truitt
 * CMIS 242 - Assignment 2: Inheritance and Encapsulation
 * 2023/02/05
 *
 */
 import java.util.UUID;

/**
 * Class representing a Snack object
 */
public class Snack {
    private String id;
    private String size;
    private double price;

    /**
     * Constructor for Snack object
     * @param size Size of the Snack (S, M, L)
     */
    public Snack(String size) {
        this.id = UUID.randomUUID().toString();
        this.size = size;
        switch (size) {
            case "S" -> this.price = 19.99;
            case "M" -> this.price = 29.99;
            case "L" -> this.price = 39.99;
        }
    }

    /**
     * Getter method for id attribute
     * @return String ID of Snack
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method for size attribute
     * @return String Size of Snack
     */
    public String getSize() {
        return size;
    }

    /**
     * Getter method for price attribute
     * @return double Price of Snack
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Snack{id='" + id + "', size='" + size + "', price=" + price + "}";
    }
}
