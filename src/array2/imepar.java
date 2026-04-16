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
public class imepar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("escreva seus numero");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

        }
        for (int n : num) {
            if (n % 2 == 0) {
                System.out.println("o numero é par");
            } else {
                System.out.println("o numero é impar");
            }

        }
    }

}
