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
public class notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nota = "i";

        do {
            System.out.println("digite sua nota em maiusculo ou sair para sair");
            nota = sc.nextLine();
            switch (nota) {
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                    System.out.println("vc passou");
                    break;
                case "F":
                    System.out.println(" ja fez a recuperação DIGITE SIM OU NAO");
                    String conf = sc.nextLine();
                    if (conf.equalsIgnoreCase("sim")) {
                        System.out.println("espere sua nota");
                    } else if (conf.equalsIgnoreCase("nao")) {
                        System.out.println("faça a recuperação");
                    } else {
                        System.out.println("opçao inexistente");
                    }
                    break;
                case "sair":
                    break;
                default:
                    System.out.println("opçao inexistente");
                    break;
            }
        }
            while (!nota.equalsIgnoreCase("sair"));
            System.out.println("vc saiu do sistema de nota");

        
        }
        }