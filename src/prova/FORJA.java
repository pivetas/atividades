/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class FORJA {

    public static void main(String[] args) {
        ArrayList<String> bau = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String c[] = new String[5];
        int op;
        Collections.addAll(bau, "poçao de vida", "poçao de mana", "escudo");

        do {
            System.out.println("vc quer:\n 1 equipar item\n 2 vizualizar itens do corpo\n 3 vizualizar bau\n 0 sair ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("qual item vc quer quipar");
                    String it = sc.nextLine();
sc.nextLine();
                    for (int i = 0; i < 5; i++) {
                        if (c[i] == it) {
                            System.out.println("item ja esta equipado");
                        } else {
                            c[i] = it;
                            bau.remove(it);
break;
                        }

                    }

                    break;
                case 2:
                    for (String co : c) {
                        System.out.println(co);
                    }
                    break;
                case 3:
                    for (String ba : bau) {
                        System.out.println(ba);
                    }
            }

        } while (op != 0);

    }

}
