/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

import java.util.Scanner;

/**
 *
 * @author FARIS
 */
public class InputArr {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array 1 Elements :");
        
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
             a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Array 2 Elements");
        
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.println(a[i][j] +" ");
            }
            System.out.println();
        }
        
        for (int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(b[i][j] +" ");
            }
            System.out.println();
        }
    }
    
    
}
