/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doWhile;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class bomba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bomba de encher ar");
        int escolha = 0;
        int ar = 0;
        do {

            ar += 10;
            System.out.println("seu pneu está ¨" + ar + "% cheio digite 1 para enchelo e 0 para sair");
            escolha = sc.nextInt();
            if (escolha == 1) {
                ar += 10;
                System.out.println("seu pneu encheu em " + ar + "%");

            }
            if (ar >= 100) {
                ar -= 100;
                System.out.println("boom; o pneu explodiu");

            }

        } while (escolha != 0);
        System.out.println("voce largou a bomba  seu pneu está " + ar + "% cheio");
    }
}
