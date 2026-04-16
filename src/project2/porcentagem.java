
package project2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class porcentagem {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o preço do seu produto");
        double pre = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");
        String vf = df.format(pre);
        System.out.println("seu produto ficará " +df.format(((double)95/100)*pre));
        
        
        
    }
}
