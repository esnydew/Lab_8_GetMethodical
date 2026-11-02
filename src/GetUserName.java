import java.util.Scanner;

public class GetUserName {
    public static void main() {
        Scanner in = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLenString(in, "What is your first name?");
        String lastName = SafeInput.getNonZeroLenString(in, "What is your last name?");
        System.out.println("Your full name is: " + firstName + " " + lastName);
    }
}