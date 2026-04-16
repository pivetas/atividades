
package aula3ifelse;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class arroba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite seu email");
        String email = sc.nextLine();
        if(email.endsWith(".com")&&email.contains("@")){
            System.out.println("seu email contem as informaçoes necessarias");
        } else{ 
            System.out.println(" seu email nao contem as informaçoes necessarias");
        }
        
        
        
        
        
    }
    
}
