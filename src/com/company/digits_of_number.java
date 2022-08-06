package com.company;
import java.util.Scanner;
public class digits_of_number {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
        System.out.println("how many number");
        int n =input.nextInt();
        int array[]=new int [10];
            for (int i = 0; i < n; i++)
            {
            array[i]=input.nextInt();
            }
            for (int i=0;i<n;i++)
            {
                int a = array[i] % 10;
                for (int j = 0; j < n; j++) {
                    System.out.println(array[j]);
                }
            }
    }
}
