package com.company;
import java.util.Scanner;
public class table_progrm
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
         int a =sc.nextInt();
        System.out.println("Table of "+a);
         for(int i=1;i<=10;i++)
         {
             System.out.println(a*i );
         }
    }
}
