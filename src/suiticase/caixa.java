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
public class caixa {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int saldo=0;
            int dep=0;
            int op=0;
            do{
                System.out.println("caixa eletronico: 1 para ver saldo; 2 para depositar 3 para sair");
                op=sc.nextInt();
                switch(op){
                    case 1:
                        System.out.println("você tem "+saldo);
                        break;
                    case 2:
                        System.out.println("digite quanto vc quer digitar");
                        dep=sc.nextInt();
                     saldo+=dep;
                        break;
                    case 3:
                        System.out.println("vc saiu");
                }
            }while (op!=3);
    }
    
}
