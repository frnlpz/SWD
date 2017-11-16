import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temp in degrees C: ");
        try {

            double c = scanner.nextDouble();
            double f = c*9/5+32;
            double k = c+273.15;

            System.out.print("Do you want F or K? ");
            String next;

            if ((next = scanner.next()).equals("F"))
                System.out.println("The temp in degrees F is " + f);
            else if (next.equals("K"))
                System.out.println("The temp in degrees K is " + k);
            else
                System.out.println("Error. Try again and choose 'F' or 'K'");

        }

        catch (InputMismatchException e) {
            System.out.println("Error. Try again and type a correct number.");
            scanner.close();
        }

        scanner.close();
    }
}