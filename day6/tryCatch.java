/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author FARIS
 */
public class tryCatch {
    public static void main(String[] args) {
        try {
            int arr[]=new int[5];
            System.out.println(arr[7]=20);
        int num=100/0;
        System.out.println(num);
        String name= null;
            System.out.println(name.length());
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Some problem occured ...");
        }
        catch(NullPointerException ex1){
            System.out.println("Null pointer exception");
    }
        catch(Exception ex1)
        {
            System.out.println("Exception occured..");
        }
        System.out.println("Rest of the lines...");
    }
    
}
