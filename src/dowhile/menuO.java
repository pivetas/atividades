/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class menuO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        int esco = 0;
        do {
            System.out.println(" faça sua escolha");
            System.out.println("1 cadastrar");
            System.out.println(" 2 consultar");
            System.out.println(" 3 sair ");
            esco = sc.nextInt();
            if (esco == 1) {
                System.out.println("opçao nao pronta");
                

            } else if (esco == 2) {
                System.out.println("opçao nao pronta");

            }

        } while (esco != 3);
        System.out.println("voce saiu");
    }
}