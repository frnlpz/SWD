package Lab2;
import java.io.BufferedInputStream;
import java.util.Scanner;

public class MainSW {
    public static void main(String[] args) {

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        System.out.println("Started. Press any key to stop.");

        if (read()!=null) {
            stopwatch.stop();
        }

        System.out.println("Stopped. It has passed " + (stopwatch.getStopTime() - stopwatch.getStartTime()) + " milliseconds.");
        System.out.println("Run it again? (Y/N)");
        String nl = read();

        if (nl.equals("Y") || nl.equals("y")) {
            main(args);
        }

        else if (nl.equals("N") || nl.equals("n"))
            System.exit(0);
    }

    public static String read(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}