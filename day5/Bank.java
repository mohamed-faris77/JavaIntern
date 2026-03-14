/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author FARIS
 */ class EXample {
   private int pwd;

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
}
public class Bank {
    public static void main(String[] args) {
        EXample e = new EXample();
        e.setPwd(1234);
         System.out.println(e.getPwd());
        
        
    }   
        
    }
