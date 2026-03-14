/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author FARIS
 */
class Adder
{
    static int add(int a ,int b)
    {
        return a+b;
    }
    static float add(float a,int b)
    {
        return a+b;
    }
    static float add (int a ,float b)
    {
        return a + b;
    }
    static float add (float a ,float b ,float c)
    {
        return a+b+c;
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(Adder.add(10, 30));
        System.out.println(Adder.add(30, 40f));
        System.out.println(Adder.add(25f, 75));
        System.out.println(Adder.add(50f, 25f, 25f));
    }
}
