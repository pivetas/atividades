
package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class voto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua data de nascimento ");
        int id = sc.nextInt();
        System.out.println("digite o ano atual");
        int ano = sc.nextInt();
        int idF= (ano - id);
        
        if(idF < 16){ 
            System.out.println(" nao pode votar ");
        }else {
            System.out.println("pode votar");
        }
       
        
        
        
        
        
        
        
    }
}
