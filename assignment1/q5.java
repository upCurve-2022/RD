
    import java.util.Scanner;
    public class q5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = input.nextInt();

        if ( num % 2 == 0 )
            System.out.println("The entered number is even");
        else
            System.out.println("The entered number is odd");
    }
}

