import java.util.Scanner;

public class Pallindrome {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, temp, r, nw=0;
        System.out.println("Enter a number to check pallindrom");
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            nw=nw*10+r;
        }
        if(nw==temp)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not a pallindrome");
        }
        sc.close();
    }
    
}
