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
public class TwoException {
    public static void main(String[] args) {
      //  String name="faris";
      //  String name1= null;
      //  System.out.println(name.length());  
      //  System.out.println(name1.length());  //null pointer exception
        
        int arr[] = new int [5];
        System.out.println(arr[1]=100);
        System.out.println(arr[6]=800); //array out of bounds exception 
    }
    
}
