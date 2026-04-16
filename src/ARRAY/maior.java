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
public class maior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[5];
        double nm = num[0];
        for (int i = 0; i < num.length; i++) {
            System.out.println("digite seu numero");
            num[i] = sc.nextDouble();
        }
        for (double numM : num) {
            if (numM > nm) {
                nm = numM;
            }
        }
        System.out.println("op maior numero é " + nm);

    }

}
