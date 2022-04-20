import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doubleNumber;
        System.out.println("Enter a number:");
        doubleNumber = input.nextDouble();
        int intPart = (int) doubleNumber;
        System.out.println("Double Number: " + doubleNumber);
        System.out.println("Integer Part: " + intPart);
        System.out.println("Decimal Part: " + (doubleNumber - intPart));
    }
}
