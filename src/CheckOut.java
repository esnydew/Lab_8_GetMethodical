import java.util.Scanner;

public class CheckOut {
    public static void main() {
        Scanner in = new Scanner(System.in);
        boolean isStillShopping;
        double shoppingCartTotal = 0.00;

        System.out.println("Welcome to the Ten Dollar Store! Here, nothing is more than $10.00, and nothing is less than $0.50!");
        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Please enter the price of your item with no dollar sign", 0.50, 10.00);
            shoppingCartTotal = shoppingCartTotal + itemPrice;
            isStillShopping = SafeInput.getYNConfirm(in, "Would you like to keep shopping?");
        } while(isStillShopping);
        System.out.printf("Your shopping cart total is: $%.2f.%n", shoppingCartTotal);
    }
}
