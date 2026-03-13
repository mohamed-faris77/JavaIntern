/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

class Animal {

    void eat() {
        System.out.println("animal is eating");
    }

    void hungry() {
        System.out.println("Animal is hungry");
    }
}

class Human {

    void think() {
        System.out.println("human is thinking");
    }

    void work() {
        System.out.println("Human is working");
    }
}

public class Example1 {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.hungry();

        Human h = new Human();
        h.think();
        h.work();

    }

}
