package com.company;
import java.util.Scanner;
public class fact_program
{
//    static int factorial(int n)
//    {
//        if (n==1 || n== 0)
//        {
//            return 1;
//        }
//        else
//        {
//            return n*factorial(n-1);
//        }
//    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value for factorial :");
        int a =sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial of "+a+" is "+fact);


//        // factorial using recursion   ->>>
//        int n =sc.nextInt();
//        System.out.println("The factorial of the given value is : "+factorial(n));
    }
}
//class test{
//    public static int fact(int n){
//        if (n==1){
//            return 1;
//        }
//        else{
//            return n*fact(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 14;
//        System.out.println(fact(n));
//    }
//}