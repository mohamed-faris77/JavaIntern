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
public class UserDetails {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your usn");
        String uid = scan.next();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your AGE");
        int age = sc.nextInt();
        
         Scanner sca = new Scanner(System.in);
        System.out.println("enter your Gender");
        char gender = sca.next().charAt(0);
        
        
        System.out.println("UID : "+uid);
        System.out.println("AGE : "+age);
        System.out.println("GENDER : "+gender);
        
    }

}
