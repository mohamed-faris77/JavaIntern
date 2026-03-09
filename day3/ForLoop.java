/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author FARIS
 */
public class ForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a input");
        int num = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num +" X "+ i +" = " +i*num);
        }
    }

}
