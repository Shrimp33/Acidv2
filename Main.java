import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Timer t: ");
        double t = input.nextDouble();
        double rate = 1;  // Not Measured Yet mL/s
        double n1 = 242.23; // in mL
        double n2 = 178 + 314.57;
        double n3 = 612.3;
        System.out.println("Cup 1 + 2: " + (n1 - (rate * t)) + " mL");
        System.out.println("Cup 3 + 4: " + (n2 - (rate * t)) + " mL");
        System.out.println("Cup 5 + 6: " + (n3 - (rate * t)) + " mL");
        input.close();
    }
}