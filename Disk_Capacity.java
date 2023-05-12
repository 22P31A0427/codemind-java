import java.util.Scanner;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        a=2*t*s*b*512;
        System.out.println(a);
    }
}