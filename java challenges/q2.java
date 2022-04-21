import java.util.*;
public class q2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height");
        int height= sc.nextInt();
        System.out.println("Enter the radius");
        int radius= sc.nextInt();
        double pie=3.14285714286;
        double volume=pie*(radius*radius)*height;
        System.out.println("Volume of the cylinder="+volume);
    }
}
