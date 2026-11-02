public class CtoFTableDisplay {
    public static void main() {
        for(double i = -102; i <= 100; i++) {
            if(i >= -100) {
                System.out.printf("%-20.2f | %22.2f%n", i, CtoF(i));
            } else if(i == -101) {
                for(int j = 0; j < 45; j++) {
                    System.out.print("-");
                }
                System.out.println();
            } else {
                System.out.println(" Celsius Temperature | Fahrenheit Temperature");
            }
        }
    }

    /**
     * A method to convert a Celsius temperature to Fahrenheit.
     * @param celsius the temperature being converted.
     * @return the temperature as Fahrenheit from Celsius.
     */
    public static double CtoF(double celsius) {
        return (celsius * (9/5)) + 32;
    }
}
