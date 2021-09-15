import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of times:");
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int sum=0;
            while (n>0)
            {
                int r=n%10;
                sum =sum+r;
                n =n/10;
            }
            System.out.println("Sum of digits: "+sum);
        }
    }
}