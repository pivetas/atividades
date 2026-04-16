package project2;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class salario {

    public static void main(String[] args) {

        Scanner teclar = new Scanner(System.in);

        System.out.println("digite seu nome");

        String nome = teclar.nextLine();

        System.out.println("digite seu salario");

        double salario = teclar.nextDouble();

        System.out.println("seu nome é " + nome + " e seu salario é de " + salario);

    }

}
