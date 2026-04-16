

package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class departamentoDeTragos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite seu nome");
        String nm =sc.nextLine();
        System.out.println("digite seu ano de nascimento ");
        int ano1 = sc.nextInt();
        System.out.println("digite o ano atual");
        int ano2 = sc.nextInt();
        
        int idad= (ano2-ano1);
        
        if (idad >= 18){
            System.out.println("apto para beber");
        }else{
            System.out.println("beba nescau");
        }
        
        
        
        
        
        
        
        
    }
}
