import java.util.Scanner;

public class PrimeNumber 
{
 public static void main(String [] args)
 {
    Scanner sc = new Scanner(System.in);
    int n, count=0;
    System.out.println("Enter a number to check prime");
    n=sc.nextInt();
    for(int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            count++;
        }
    }
    if(count==1)
    {
        System.out.println("Prime");
    }
    else
    {
        System.out.println("Not Prime");
    }
    sc.close();
 }   
}
