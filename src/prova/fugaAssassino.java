/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suiticase;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class fugaAssassino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int progre = 0;
        int op;
        int chefe = 0;

        System.out.println("============================\nseja bem vindo ao jogo\n============================");
        do {
            int chance = rd.nextInt(50 + 1);
            if (chefe == 100) {
                System.out.println("vc foi pego pelo chefe, tente novamente");
                progre -= progre;

            } else {

      

                System.out.println("qual a sua açao sabendo que um assassino esta lhe perseguindo?\n progredir a fiaçao=1\n se esconder =2\n desistir e fugir para floresta=3");
                op = sc.nextInt();

                System.out.println();
               
                System.out.println("=========================");

                switch (op) {
                    case 1:
                        int concer = rd.nextInt(35 + 1);
                        progre += concer;
                        System.out.println("os fios foram concertados em " + concer + "% \n progresso atual da fiaçao "+ progre);
                        chefe += chance;
                        System.out.println("a chance do assassino te pegar aumentou\n chance atual do chefe" + chefe+"\n=========================");
                        break;
                    case 2:
                        System.out.println("chance do assassino resetada, escolha sua proxima açao\n=========================");
                        chefe -= chefe;
                        break;
                    case 3:
                        System.out.println("você fugiu para a floresta\n=========================");
          break;
                }
            }
            
        }while (progre != 100);
            System.out.println("parabens voce ganhou");
        }
    }
