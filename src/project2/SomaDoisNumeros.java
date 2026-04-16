package project2;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class SomaDoisNumeros {

    public static void main(String[] args) {
        Scanner teclar = new Scanner(System.in);
        System.out.println("digite um numero");

        int n1 = teclar.nextInt();
        System.out.println("digite outro numero");

        int n2 = teclar.nextInt();
        System.out.println("o resultado é " + (n1 + n2));

        int resultado = n1 + n2;
        int resultM = (n1 + n2) / 2;
        int sub = n1-n2;
        int  mult = n1*n2;
        int mod = n1%n2;

        System.out.println("o resultado da soma entre " + n1 + " e " + n2 + " será " + resultado);
        System.out.println("o resultado da media entre " + n1 + " e " + n2 + " será " + resultM);      
        System.out.println("o resultado da subtracao entre " + n1 + " e " + n2 + " será " + sub);      
        System.out.println("o resultado da da multiplicaçao entre " + n1 + " e " + n2 + " será " +mult);        
        System.out.println("o resultado do modulo entre " + n1 + " e " + n2 + " será " + mod);
        System.out.println("o resultado da divisao entre " + n1 + " e " + n2 + " será " + (double)n1/n2);



        

    }

}
