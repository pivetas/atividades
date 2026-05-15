/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class HALL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> hall = new HashSet<String>();
        int op;
        do {
            System.out.println("DIGITE 1 PARA ADICIONAR NOME NO HALL 2 PARA VER LISTA OU 0 PARA SAIR");
            op = sc.nextInt();
sc.nextLine();
            switch (op) {
                
                case 1:
                    System.out.println("adicione o nome do jogo");
                    String nome = sc.nextLine();
                    
                    if (hall.contains(nome)) {
                        System.out.println("jogo ja esta na lista");
                    } else {
                        hall.add(nome);
                        System.out.println("nome adicionado");
                    }
                    break;
                case 2:
                    System.out.println(hall);

                    break;
                    case 0:
                    System.out.println("saiu");
                    break;
                default:
                    System.out.println("opçao invalida");
                    break;
            }
          
        } while (op!=0);
        System.out.println("programa terminado");
    }
}
