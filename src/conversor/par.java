
package conversor;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu numero ");    
        int num = sc.nextInt();
        boolean par = (num % 2 == 0);
        System.out.println("o numero "+num+ " é par? "+par);
        
        
        
        
    }
    
}
