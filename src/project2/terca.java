package project2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class terca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu numero ");
        double num = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("0.0000");
        String vf = df.format(num);
        System.out.println("o dobro do seu numero é " + (num * 2) + " e a terceira parte do seu numero é " + df.format(num / 3));
    

    }

}
