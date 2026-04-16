package project2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class moedas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva quanto vc tem na conta");
        double con = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        String vf = df.format(con);

        System.out.println("você pode comprar " + df.format(con / 5.45) + " dolars");

    }
}
