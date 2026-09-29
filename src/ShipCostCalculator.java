import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {

        // output ask user item price
        // If the item price is 100 or more
        // Set shipping cost to 0
        // or if less than 100 calculate shipping cost as 2% of the item price
        // Add item price and shipping cost
        // output shipping cost
        // output total price

        Scanner in = new Scanner(System.in);

        double itemPrice;
        double shippingCost;
        double totalPrice;

        System.out.println("Enter item price:");
        itemPrice = in.nextDouble();

        if (itemPrice >= 100)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = itemPrice * 0.02;
        }

        totalPrice = itemPrice + shippingCost;

        System.out.println("The shipping cost is " + shippingCost);
        System.out.println("The total price is " + totalPrice);
    }
}
