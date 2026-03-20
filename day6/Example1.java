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
//maximum of array element
public class Example1 {
     public static void main(String[] args) {
        int max = 0;
        int arr[] = {100,200,300,400,500,600,700};
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]> max)
                max = arr[i];
        }
         System.out.println("Max element is :" + max);
    }
    
}
