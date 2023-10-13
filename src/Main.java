import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tempC;
        double tempF;
        String yn;
        boolean stop = false;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
            if (scan.hasNextDouble()) {
                tempC = scan.nextDouble();
                tempF = (tempC * 9)/5 + 32;
                scan.nextLine();
                System.out.printf("\nDegrees C : %9.2f", tempC);
                System.out.printf("\nDegrees F : %9.2f", tempF);
                System.out.println("\nWould you like to input another temperature? [Y/N]");
                yn = scan.nextLine();
                if (yn.equalsIgnoreCase("N")) {
                    stop = true;
                }
            } else {
                System.out.println("You have entered an invalid temperature value. Please try again.");
                scan.next();
            }
        } while (!stop);
    }
}
