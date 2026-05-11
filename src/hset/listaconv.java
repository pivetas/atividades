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
public class listaconv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> n = new HashSet<>();
        int op;
        String name;
        do {
            System.out.println("digite 1 para adicionar convidadoz\n 2 para excluir um convidado\n 3 para ver a lista\n 4 para sair ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("adicione o nome do convidado");
                    name = sc.nextLine();
                    n.add(name);
                    break;
                case 2:
                    System.out.println("digite o convidado que deseja eexcluir");
                    name = sc.nextLine();
                    if (!n.contains(name)) {
                        System.out.println("  usuario ja existe nao existe");
                    } else {
                        n.remove(name);
                    }
                    break;
                case 3:
                    System.out.println("sua lista");
                    for (String l : n) {
                        System.out.println(l);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opçao invalida");
                    break;
            }
        } while (op != 4);
        System.out.println("voce saiu");

    }
}