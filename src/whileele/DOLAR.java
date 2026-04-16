/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileele;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class DOLAR {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        double cotad= 5.19;
        System.out.println("quantas vc quer converter");
        int vzs = sc.nextInt();
        int contador = 1;
        while (contador <= vzs){
            System.out.println("qual o valor em real");
            double valoreal=sc.nextDouble();
            double dolares= valoreal / cotad;
            System.out.printf("o valor convrtido é  u$ %.2f" ,dolares);
            contador++;
        }
        
    }
    
}
