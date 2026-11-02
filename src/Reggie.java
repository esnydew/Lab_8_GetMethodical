import java.util.Scanner;

public class Reggie {
    public static void main() {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Please enter your social security number", "\\d{3}-\\d{2}-\\d{4}$");
        String mNum = SafeInput.getRegExString(in, "Please enter your student M number", "(M|m)\\d{5}");
        String menuChoice = SafeInput.getRegExString(in, "Please enter your menu choice", "^[OoSsVvQq]$");
        System.out.printf("This student of M Number %s with a SSN of %s chose the menu option %s.%n", mNum, ssn, menuChoice);
    }
}
