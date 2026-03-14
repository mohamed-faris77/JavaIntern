/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author FARIS
 */
abstract class person
{
    void sleep()
    {
        System.out.println("Sleeping");
    }
    void eat()
    {
        System.out.println("Eating....");
    }
    abstract void study();
}
class faris extends person
{ 
    void study()
    {
        System.out.println("studying...");
    }
    void play()
    {
        System.out.println("playing");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        faris f=new faris();
        f.study();
        f.play();
        f.eat();
    }
    
}
