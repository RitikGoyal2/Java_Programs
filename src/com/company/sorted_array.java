package com.company;
import java.util.Scanner;
public class sorted_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int n =sc.nextInt();
        int []a;
        a=new int [n];
        System.out.println("Enter the elements in array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
/*
       for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Maximum element in this array is :");
        System.out.println(a[n-1]);
        System.out.println("Minimum element in this array :");
        System.out.println(a[0]);

*/

        // Program to check whether a array is sorted or not

        int count =0;
        for(int j =0 ; j<n;j++)
        {
            if (count == n-1  )
            {
                System.out.println("yes this array is sorted");
            }
           else if(a[j]<a[j+1])
            {
                count++;

            }
                else
                {
                    System.out.println("no this array is not sorted :");
                    break;
                }

            }
        }

    }

