
package FOR;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class CONTADOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = sc.nextInt();
        
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+ "x" +i+ "=" +(num*i) );
            
        }
        }
    }
    