package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class print_prime_between {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("From where:");
        int a =input.nextInt();
        System.out.println("To:");
        int b =input.nextInt();
        System.out.println("Prime numbers between " +a+ " and "+b);
    for (int i =a;i <= b;i++)
    {
        int flag=0;
        for (int j=2; j <= i/2;j++)
        {
            if (i%j==0)
            {
                flag=1;
                break;
            }
        }
        if (i==0 || i==1)
        {
            System.out.println(i+ "it is neither prime not composite");
        }
        else
        {
            if (flag == 0)
            {
                System.out.println(i);
            }
        }
    }
    }
}
