package com.company;
import java.util.Scanner ;
public class cbse_percentage {
    public static void main (String [] args)
    {
        float  percentage ;
        System.out.println("percent calculator of five subjects ");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of your English subject ");
        int  a = sc.nextInt();
        System.out.println("Enter the marks of your Math subject ");
        int  b = sc.nextInt();
        System.out.println("Enter the marks of your Physics subject ");
        int   c = sc.nextInt();
        System.out.println("Enter the marks of your Chemistry subject ");
        int    d = sc.nextInt();
        System.out.println("Enter the marks of your Physical Education  subject ");
        int e = sc.nextInt();
        percentage   = (((a+b+c+d+e)/500.0f)*100);
        System.out.println("your board percentage is : ");
        System.out.println(percentage );

    }
}
