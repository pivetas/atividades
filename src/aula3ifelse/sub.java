
package aula3ifelse;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class sub {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite alco com a palavra java");
        String plvr = sc.nextLine();
        String nv = plvr.replace("java", "programaçao");
        System.out.println("seu texto ficou: "+nv);
    }
}
