/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FOR;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class maiormenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("difgite seu numero");
        int num =sc.nextInt();
        int maior = num;
        int menor = num;

        for (int i = 0; i < 6; i++) {
            System.out.println("digite seu numero");
            num = sc.nextInt();

            if (num >= menor) {
                maior= num;
            }else if (num <= maior) {
               menor = num;
            }
        }
        System.out.println("o maior numero é " +maior);
                System.out.println("o menor numero é " +menor);

    }
}