/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author FARIS
 */
public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a character");
        char alpha = scan.next().charAt(0);

        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println("it is a vowel");
        } else {
            System.out.println("its not a vowel");
        }
    }

}
