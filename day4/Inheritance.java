/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

class vehicle {

    void speed() {
        System.out.println("Vehicle has top speed of 120mph");
    }

    void gear() {
        System.out.println("Vehicle has 6+1 gear system");
    }
}

class Car extends vehicle {

    void gearsystem() {
        System.out.println("vehicle has manual gear box");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Car c = new Car();
        c.gear();
        c.gearsystem();

    }

}
