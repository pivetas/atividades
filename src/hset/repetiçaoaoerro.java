/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author piveta
 */
public class repetiçaoaoerro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> n = new HashSet<>();
        int op;
        System.out.println("escreva seus numeros");

        op = sc.nextInt();

        sc.nextLine();
        n.add(op);
        op = sc.nextInt();
        sc.nextLine();
        while (!n.contains(op)) {
            n.add(op);
            op = sc.nextInt();

            sc.nextLine();

        }
        System.out.println(" numero ja existente\n sua lista ficou " + n);
    }

}
