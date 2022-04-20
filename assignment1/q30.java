import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        System.out.println("Enter the values to perform the arthemetic");
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int m= sc.nextInt();
        int p= sc.nextInt();
        int q= sc.nextInt();
        int r= sc.nextInt();
        int s= sc.nextInt();
        System.out.println(n+m+(p*q)-r/s);

    }
}
