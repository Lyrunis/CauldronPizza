package pizzaorder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private List<String> toppings;
    private double basePrice;

    private static final double TAX_RATE = 0.07; // Tax rate of 7%

    // Constructor
    public Pizza(String size, String crust) {
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>();
        setBasePrice();
    }

    // Method to set base price based on size
    private void setBasePrice() {
        switch (size) {
            case "Small - $8.00":
                basePrice = 8.00;
                size = "S";
                break;
            case "Medium - $12.00":
                basePrice = 12.00;
                size = "M";
                break;
            case "Large - $16.00":
                basePrice = 16.00;
                size = "L";
                break;
            case "Super - $20.00":
                basePrice = 20.00;
                size = "XL";
                break;
            default:
                basePrice = 0.00;
                break;
        }
    }

    // Method to add toppings
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    // Method to calculate total price
    public double calculateTotal() {
        double total = basePrice + (toppings.size() * 1.00); // Each topping adds $1.00
        double tax = total * TAX_RATE;
        return total + tax; // Return total including tax
    }

    // Method to get formatted order details for a receipt
    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("=========================================\n");
        details.append("Crust & Size\tPrice\n");
        details.append(crust).append(" (").append(size).append(")\t$").append(basePrice).append("\n\n"); // crust+size price
        details.append("Toppings\tPrice\n");

        // List toppings and their prices
        for (String topping : toppings) {
            details.append(topping).append("\t$1.00\n");
        }

        // Calculate subtotal and total
        double subTotal = basePrice + (toppings.size() * 1.00);
        double tax = subTotal * TAX_RATE;
        double finalTotal = calculateTotal();

        details.append("\nSub-total:\t").append(String.format("$%.2f\n", subTotal));
        details.append("Tax:\t").append(String.format("$%.2f\n", tax));
        details.append("---------------------------------------------------------------------\n");
        details.append("Total:\t").append(String.format("$%.2f\n", finalTotal));
        details.append("=========================================\n");

        return details.toString();
    }
}
