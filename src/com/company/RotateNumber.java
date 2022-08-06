package com.company;

import java.util.Scanner;

public class RotateNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        String a =sc.nextLine();
//        System.out.println("Enter from you want to rotate the number : ");
//        int b =sc.nextInt();
//        for(int i =a.length();i>=a.length()-b+1;i--)
//        {
//            System.out.print(a.charAt(i-1));
//        }
//        for(int i=0;i<a.length()-b;i++)
//        {
//            System.out.print(a.charAt(i));
//        }

        String a =sc.nextLine();
        int b =sc.nextInt();
        for(int i =a.length()-(b);i<a.length();i++)
        {
            System.out.print(a.charAt(i));
        }
        for(int i=0;i<a.length()-b;i++)
        {
            System.out.print(a.charAt(i));
        }
    }
}
