import java.util.Scanner;

public class BirthDateTime {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int birthDay = 0;

        int birthYear = SafeInput.getRangedInt(in, "Please enter your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Please enter your birth month", 1, 12);
        birthDay = switch (birthMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "Please enter your birth day", 1, 31);
            case 4, 6, 9, 11 -> SafeInput.getRangedInt(in, "Please enter your birth day", 1, 30);
            case 2 -> SafeInput.getRangedInt(in, "Please enter your birth day", 1, 29);
            default -> birthDay;
        };
        int birthHour = SafeInput.getRangedInt(in, "Please enter the hour you were born", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Please enter the minute you were born", 1, 59);
        System.out.printf("You were born in %d on the day %d of the month %d at %d:%d.%n", birthYear, birthDay, birthMonth, birthHour, birthMinute);
    }
}
