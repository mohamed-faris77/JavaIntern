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
public class Example1 {

    public static void main(String[] args) {
        int age = 19;
        int weight = 35;
        if (age > 18) {
            if (weight > 45) {
                System.out.println("you are able to donate blood");
            } else {
                System.out.println("you are not able to donate blood");
            }
        } else {
            System.out.println("you're age must be above 18");
        }
    }

}
