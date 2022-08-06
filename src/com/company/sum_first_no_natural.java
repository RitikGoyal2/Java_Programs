package com.company;
import java.util.Scanner;
public class sum_first_no_natural
{
    // using simple function
    static int sum(int a)
    {
        int result =0;
        for (int i=1;i<=a;i++)
        {
            result +=i;
        }
    return result;
    }


    // using recursive function
    static int sum1(int a)
    {
        if (a==1)
        {
            return 1;
        }
        else
        {
            return a + sum1(a-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int a = sc.nextInt();
        System.out.println("The sum of first "+a+" natural no sum "+sum(a));
        System.out.println("The sum of first "+a+" natural no sum "+sum1(a));

    }
}
