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
public class SwitchCase2 {

    public static void main(String[] args) {
        System.out.println("Welcome to hotel Venus");
        System.out.println("----Hotel Menu----");
        System.out.println("1.Dosa--->20");
        System.out.println("2.Idli--->10");
        System.out.println("3.Vada--->15");
        System.out.println("4.Coffee--->10");
        System.out.println("5.Gulab Jamun--->15");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice ");
        String food = scan.next();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Quantity :");
        int qty = sc.nextInt();

        switch (food) {
            case "dosa":
                System.out.println("you have ordered Dosa ");
                System.out.println("your price :" + (qty * 20));

                break;
            case "idli":
                System.out.println("you have ordered Idli");
                System.out.println("your price :" + (qty * 10));
                break;
            case "vada":
                System.out.println("you have ordered Vada");
                System.out.println("your price :" + (qty * 15));
                break;
            case "coffee":
                System.out.println("you have ordered Coffee");
                System.out.println("your price :" + (qty * 10));
                break;
            case "gulab jamun":
                System.out.println("you have ordered Gulab Jamun");
                System.out.println("your price :" + (qty * 15));
                break;
            default:
                System.out.println("not available");
        }

    }

}
