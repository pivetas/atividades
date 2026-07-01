/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o nome do seu pokemon de fogo");
        String nomeF=sc.nextLine();
        sc.nextLine();
        System.out.println("escreva o nome do seu pokemon de agua");
        String nomeA=sc.nextLine();
        pokemonFogo p1=new pokemonFogo(nomeF);
        pokemonAgua p2= new pokemonAgua(nomeA);
        p1.atacar();
        p2.atacar();
        
    }
}
