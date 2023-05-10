import java.util.*;
import java.lang.*;
public class solution
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       double a,b,c;
       double s,t;
       a=sc.nextDouble();
       b=sc.nextDouble();
       c=sc.nextDouble();
       s=(a+b+c)/2;
       t=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.format("%.2f",t);
       
    }
}