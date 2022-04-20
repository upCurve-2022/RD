
    import java.util.Scanner;
    public class q14{

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n,i,pr=2;
            System.out.printf("Enter the range of number(Limit):");
            n=sc.nextInt();
            System.out.print("1 ");
            for(i=0;i<n-1;i++)
            {
                pr=(pr*2)-i;
                System.out.print(pr+" ");
            }
            sc.close();
        }
    }

