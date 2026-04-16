/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class negativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[10];
        System.out.println("digite os seus numeros");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
        }
        for (double n : num) {
            if (n < 0) {
                n = 0;
                System.out.println(n);
            } else {
                System.out.println(n);

            }
        }
    }

}
