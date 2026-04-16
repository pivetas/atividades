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
public class biscoito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("escolha 1 para abrir o biscoito e 0 para sair");
            escolha = sc.nextInt();
            if (escolha == 1) {
                System.out.println("crack, o biscoito diz: dentro de você há dois lobos, pare comer lobos!");
            }

        } while (escolha != 0);
        System.out.println(" você desistiu do biscoito");

    }

}
