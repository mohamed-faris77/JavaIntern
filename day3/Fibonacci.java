/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author FARIS
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        
        for(int i=2;i<=7;i++)
        {
            int nextVal = a + b;
            a = b;
            b = nextVal;
            
            System.out.println( nextVal );
        }
    
}
}