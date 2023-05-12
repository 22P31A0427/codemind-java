import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String v[]=s.split(":");
        int h,m;
        Float a;
        h=Integer.parseInt(v[0]);
        m=Integer.parseInt(v[1]);
        a=30*h-((float)11/2)*m;
        a=Math.abs(a);
        if(a>180)
        System.out.println(360-a);
        else
        System.out.println(a);
        
    }
}