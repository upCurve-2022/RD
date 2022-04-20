import java.util.*;
   public class q7{
        public static void main (String[] args){
            int size;//variable declaration for size of array
            int firstNum=0, secondNum=0;
            Scanner scan=new Scanner(System.in);
            System.out.print("Enter the number of element: ");
            size=scan.nextInt();
            int arr[]=new int[size];
            for(int i=0; i<size; i++)
            {
                System.out.print("Enter the array element "+(i+1)+" :");
                arr[i]=scan.nextInt();
                if(firstNum<arr[i]){
                    secondNum=firstNum;
                    firstNum=arr[i];
                }
                else if(secondNum<arr[i]){
                    secondNum=arr[i];
                }
            }
            System.out.println("\nThe largest number is: "+firstNum);
            System.out.println("The second largest number is: "+secondNum);
        }
    }

