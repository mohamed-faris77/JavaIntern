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
public class Grades {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your Mark");
        int mark = scan.nextInt();
        if (mark >= 470) {
            System.out.println("distinction");
        } else if (mark >= 400 && mark < 470) {
            System.out.println("A grade");
        } else if (mark >= 300 && mark <= 399) {
            System.out.println("B grade");
        } else if (mark >= 200 && mark <= 299) {
            System.out.println("C grade");
        } else {
            System.out.println("you Failed");

        }

    }
}
