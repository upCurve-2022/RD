import java.util.Scanner;
import java.lang.*;
public class q13
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
        System.out.print(Math.pow(i,i) + " ");
    }
}
}
