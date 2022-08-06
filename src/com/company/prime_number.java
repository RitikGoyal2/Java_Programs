package com.company;
import java.util.Scanner;
public class prime_number
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("!!!!!!!!!  How many number you want to check whether it is prime or not   !!!!!!!!! ");
        int a = scn.nextInt();
            for (int i = 0; i < a; i++)
            {
                int flag =0;
                int n = scn.nextInt();
                for (int j = 2; j <= n / 2; j++)
                {
                    if (n % j == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                if (n == 0 || n == 1)
                {
                    System.out.println("it is neither prime nor composite");
                }
                else
                {
                    if (flag == 1)
                    {
                        System.out.println("not prime");
                    }
                    else
                    {
                        System.out.println("prime");
                    }
                }
            }
    }
}