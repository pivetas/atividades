/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caminhoDaForça;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main { public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("digite o nome do seu mestre jedi");
            String nome=sc.nextLine();
            
            System.out.println("digite o nivel da força");
            int força=sc.nextInt();
            System.out.println("digite a cor do sabre");
            sc.nextLine();
            String corDoSabre=sc.nextLine();
            mestreJedi m1= new mestreJedi(corDoSabre, nome, força);
            m1.usarForça();
            m1.exibirMestre();
    }
    
}
