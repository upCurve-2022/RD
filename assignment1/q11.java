import java.util.*;
public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Nth term “N” ");
        int n = s.nextInt();
        for (int i = 2; i <= 2 * n; i += 2) {
            int result = (i * i);
            System.out.print(result + " ");
        }
    }
}


