package conversor;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class anobi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dogite um ano");
        int ano = sc.nextInt();
        
        boolean bissexto = ((ano % 4==0) && (ano % 100 != 0) || (ano % 400 == 0));
        System.out.println("o ano "+ano+ " é bissexto "+bissexto);
    }
}
