/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do seu personagem");
        String nome=sc.nextLine();
        personagemRPG p1=new personagemRPG(nome, 50);
        
        System.out.println("apos criar seu personagem vc foi mandado para uma floresta e um orc te atacou");
        int dano=60;
        System.out.println("vc quer desviar ou receber o ataque\n1 para receber o ataque \n2 para desviar");
        int op=sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("vc recebeu o ataque");
                p1.receberDano(dano);
                
                
                break;
            case 2:
                System.out.println("vc nao conseguiu desviar ");
                p1.receberDano(dano);
            break;
            
            default:
                System.out.println("op errada");
                break;
        }
    }
   
}
