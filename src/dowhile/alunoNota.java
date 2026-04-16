package doWhile;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class alunoNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
      
        int soma = 0;
        int contador = 0;
      
        do {
            System.out.println("digite sua nota ");
            nota = sc.nextInt();
            if (nota > 0 && nota < 10) {
                soma += nota;
                contador++;
            } else {
                System.out.println("reescreva sua nota");
            }

        } while (contador < 4);
            int calculoMed = (soma / contador);
        System.out.println("sua nota ficou " + calculoMed);
    }

}
