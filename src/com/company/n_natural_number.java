package com.company;
import java.util.Scanner;
public class n_natural_number
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
// N natural number program using do while loop


    //    System.out.println("Enter the value");
      //  int a =sc.nextInt();
        //int i=1;
        //System.out.print("Natural numbers are : ");
         //do {
           //  {
             //    System.out.print(+i +" ");
               //  i++;
             //}
         //}while(i<=a);



         // N natural numbers program using for loop


      //  System.out.println("Enter number : ");
        //int b = sc.nextInt();
        //System.out.println("Natural numbers are :");
      //  for( int c =1; c<=b ;c++)
       // {
         //   System.out.println(c);
        //}


        // N natural numbers program in reverse order:
        System.out.println("Enter number");
        int o =sc.nextInt();
        for(int i=o;i>0;i--)
        {
            System.out.println(+i);
        }
    }
}
