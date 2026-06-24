/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite quanto vc quer depositar");
        double valor = sc.nextDouble();
        System.out.println(valor);
        System.out.println("digite 1 para depositar e 2 para sacar");
        int op = sc.nextInt();
        System.out.println("teste2 "+op);
        contaBancaria co = new contacorrente(valor);
        switch (op) {
            case 1:
                co.depositar(valor);

                break;
            case 2:
                co.sacar(valor);
                break;
            default:
                System.out.println("op invalida");
                break;
        }
        co.ver();
        // contaBancaria co=new contacorrente();
    }

}
