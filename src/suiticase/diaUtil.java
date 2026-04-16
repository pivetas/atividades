/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suiticase;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class diaUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("digite o numero do dia que vc quer saber se é util ou nao, digite 8 para sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("domingo nao é dia util");
                    break;
                case 2:
                    System.out.println("segunda é dia util");
                    break;
                case 3:
                    System.out.println("terça é dia util");
                    break;
                case 4:
                    System.out.println("quarta é dia util");
                    break;
                case 5:
                    System.out.println("quinta é dia util");
                    break;
                case 6:
                    System.out.println("sexta é dia util");
                    break;
                case 7:
                    System.out.println("sabado nao é dia util");
                    break;
                case 8:
                    System.out.println("vc saiu");
                    break;
                default:
                    System.out.println("opçao invalida");
                    break;
            }
         
        }   while (op != 8);
    }
}