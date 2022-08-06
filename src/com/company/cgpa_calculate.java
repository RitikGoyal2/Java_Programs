package com.company;
import java.util.Scanner ;
public class cgpa_calculate {
    public static void main (String [] args)
    {
        float  percentage ;
        double  CGPA;
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
        float e = sc.nextInt();
        percentage   = (((a+b+c+d+e)/500)*100);
        CGPA  = percentage/9.5;
        System.out.println("your CGPA is  : ");
        System.out.println(CGPA);

    }
}
