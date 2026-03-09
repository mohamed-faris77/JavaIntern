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
public class SwitchCase {

    public static void main(String[] args) {
        char alpha = 'e';
        switch (alpha) {
            case 'a':
                System.out.println("alphabet is a ,it is a vowel");
                break;
            case 'e':
                System.out.println("alphabet is e ,it is a vowel");
                break;
            case 'i':
                System.out.println("alphabet is i ,it is a vowel");
                break;
            case 'o':
                System.out.println("alphabet is o ,it is a vowel");
                break;
            case 'u':
                System.out.println("alphabet is u ,it is a vowel");
                break;
            default:
                System.out.println("it is not a vowel");
        }

    }

}
