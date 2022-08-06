package com.company;
import java.util.Scanner;
public class fibonacci_series {
/*
static void  fab(int n)
{
    int []a;
        for (int i = 0; i < n - 2; i++)
        {
            a[i + 2] = a[i] + a[i + 1];
            System.out.println(a[i]);
        }
}*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        a[0] = 0;
       a[1] = 1;
       for (int i = 0; i < n - 2; i++)
        {
         a[i + 2] = a[i] + a[i + 1];
       }
        System.out.println("First " + n + " fibonacci numbers : ");
     for (int j = 0; j < n; j++)
        {
           System.out.print(a[j] + " ");
       }


       // System.out.println(fab(n));
    }
}
