
package conversor;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class aprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite sua nota");
        double nota= sc.nextDouble();
        System.out.println("digite sua frequencia");
        double freq = sc.nextDouble();
        
        boolean tot= (nota >= 60)&&(freq >= 75);
        System.out.println("vc passou?"+tot);
        
        
        
        
        
        
        
        
        
    }
}
