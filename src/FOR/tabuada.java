
package FOR;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" digite o numero da tabuada que você quer ");
        int num= sc.nextInt();
        
        for (int i=0 ; i <= 10; i++){
            System.out.println("sua tabuada ficou " +num+ "x" +i+ " = " +(num*i)); 
           
        }
        
        
        
        
        
        
    }
    
}
