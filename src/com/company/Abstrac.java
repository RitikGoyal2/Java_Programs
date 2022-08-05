package com.company;
 abstract class parent
{
    parent()
    {
        System.out.println("I am a constructor of parent class ");
    }
    public void rect()
    {
        System.out.println("I am a function of rectangle method : ");
    }
      abstract public void greet();
}
class child extends parent
{
    @Override
    public void greet()
    {
        System.out.println("Good morning");
    }
}
 abstract class child1 extends parent{
     public void on()
     {
         System.out.println("ok");
     }
}

public class Abstrac
{
    public static void main(String[] args) {



    }
}
