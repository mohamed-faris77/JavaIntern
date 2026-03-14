/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

interface Faris 
{
    int id = 1234;
    void Far();
}
class Demo implements Faris
{
   public void Far()
    {
        System.out.println("this is show method");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Demo d= new Demo();
        d.Far();
        System.out.println(d.id);
    }
}
