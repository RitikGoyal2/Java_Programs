package com.company;

class fact
{
    int data =5;

    void change( fact s)
    {
        s.data =s.data+100;
//        System.out.println(data);
    }
}
public class factorial {
    public static void main(String[] args) {
        fact s = new fact();
        System.out.println(s.data);
//        s.change(100);
//        System.out.println(s.data);
//        s.change(s);
        System.out.println(s.data);
    }
}
