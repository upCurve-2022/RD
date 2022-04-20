import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        System.out.println("Enter a string value ::");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.isEmpty()&& str==null ){
            System.out.println("Given string is empty or null");
        }else{
            System.out.println("Given string is not empty or null");
        }
    }
}