package project2;

import java.util.Scanner;

public class DALE {

    public static void main(String[] args) {

       /* Scanner teclado = new Scanner(System.in);

        String nome = "piveta";
        System.out.println("prazer, sou o " + nome + " la ele");*/
        
        Scanner teclado = new Scanner(System.in);
       
       
       
       System.out.println("digite seu nome: ");
       String nome = teclado.nextLine();
       System.out.println("digite sua idade: ");
       int idade = teclado.nextInt();
    }

}