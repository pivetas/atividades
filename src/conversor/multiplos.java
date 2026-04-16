
package conversor;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva seu numero");
        double num = sc.nextDouble();
        
        boolean chek = ((num % 3 == 0)||(num % 7 == 0));
        System.out.println("seu numero é divisivel por 7 ou 3 "+chek);
        
        
        
        
        
        
        
        
        
        
        
    }
}
