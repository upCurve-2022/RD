import java.util.*;

public class q12
{
    static int calculateSum(int n)
    {
        if (n % 2 == 1)
            return (n + 1) / 2;

        return -n / 2;
    }

    public static void main(String ar[])
    {

        int n = 8;
        System.out.println(calculateSum(n));
    }
}