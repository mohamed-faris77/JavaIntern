/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author FARIS
 */
public class MultiDimentionalArr {
    public static void main(String[] args) {
        int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }
    }
}
