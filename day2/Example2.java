/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author FARIS
 */
public class Example2 {
    int a = 10;
    static int b = 20;
    
    
     void show()
    {
        int c = 30;
        System.out.println(c);
    }
     void play()
     {
         int d = a + b;
         System.out.println(d);
     }
    public static void main(String args[])
    {
        System.out.println(b);
        Example2 faris = new Example2();
        System.out.println(faris.a);
        faris.show();
        faris.play();
        
    }
    
}
