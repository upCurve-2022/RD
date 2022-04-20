import java.util.Scanner;

public class q6
{
    public static void main(String[] args)
    {
        String strOne, strTwo;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        strOne = scan.nextLine();
        System.out.print("Enter the Second String: ");
        strTwo = scan.nextLine();

        if(strOne.equals(strTwo))
            System.out.println("\nBoth Strings are equal.");
        else
            System.out.println("\nBoth Strings are not equal.");
    }
}