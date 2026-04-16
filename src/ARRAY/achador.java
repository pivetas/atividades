/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class achador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int quant = 0;
        int  op = 0;
        do {
            System.out.println("digite 1 para adicionar uma numero e 2 para procurar um numero e 3 pçara sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("digite a quantidade de numeros que vc quer colocar ");
                    quant = sc.nextInt();
                    System.out.println("digite os numeros que vc quer colocar");
                    for (int i = 0; i < quant; i++) {
                        num[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("digite o num que vc quer procura");
                    int procurado = sc.nextInt();

                    boolean encontrado = false;

                    for (int n : num) {
                        if (n == procurado) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        System.out.println("Numero encontrado no array!");
                    } else {
                        System.out.println("Numero nao encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("saiu");
                    break;
                default:
                    break;
            }
            
        }while (op!=3);
       
        }
}