package project2;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class ante_suce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu numero");
        int num = sc.nextInt();
        System.out.println("seu numero é " + num + " o antecessor dele é " + (num - 1) + " e o  dele é " + (num + 1));

    }

}
