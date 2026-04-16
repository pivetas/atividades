package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class promoçao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        String name = sc.nextLine();
        System.out.println("digite o valor das suas compras");
        double compra = sc.nextDouble();
        System.out.println("digite seu sexo  ");
        sc.nextLine();
        String sx = sc.nextLine();
        double man = (((double) 95 / 100) * compra);
        double wom = (((double) 87 / 100) * compra);

        if (sx.equals("homem") || sx.equals("masculino")) {
            System.out.println("sua compra ficou: " +man);
        } else if (sx.equals("mulher")|| sx.equals("feminino")) {
            System.out.println("sua compra ficou " + wom);
        } else {
            System.out.println("sexo inexistente");
        }

    }
}
