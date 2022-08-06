package com.company;
import java.util.Scanner;
public class even_number_sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
     //   System.out.println("Enter the value");
       // int a =sc.nextInt();
        //int sum =0;
        //for (int i=2;i<=a;i++)
       // {
        //  sum=sum+i;
          //  System.out.println(i);
         //   i++;
       // }
       // System.out.println("Sum of even numbers up to "+a+": "+sum);


        System.out.println("Enter the value");
        int b =sc.nextInt();
        int c =0;
        for (int j=2;j<=2*b;j++)
        {
            c=c+j;
            //  System.out.println(i);
            j++;
        }
        System.out.println("Sum of first "+b+ " even number : "+c);



    }
}
