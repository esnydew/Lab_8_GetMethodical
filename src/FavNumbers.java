import java.util.Scanner;

public class FavNumbers {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "Please enter your favorite integer (whole number)");
        double favDouble = SafeInput.getDouble(in, "Please enter your favorite double (decimal number)");
        System.out.printf("Your favorite integer is: %d. Your favorite double is: %s.%n", favInt, favDouble);
    }
}
