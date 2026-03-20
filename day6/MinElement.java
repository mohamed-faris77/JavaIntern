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
public class MinElement {
     public static void main(String[] args) {
        int arr[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }

}

