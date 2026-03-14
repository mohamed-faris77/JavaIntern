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
class  Plane{
    void fly()
    {
        System.out.println("plane is flying");
    }
}
class Flight  extends Plane
{
    void fly()
    {
        System.out.println("Fighter ploane is flying");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
     Flight f = new Flight();
     f.fly();
     f.fly();
     Plane p = new Plane();
     p.fly();
     p.fly();
             
        
    }
    
}
