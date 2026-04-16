
package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class caracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome");
        String name = sc.nextLine();
        int quant = name.length();
        
        if(quant>5){
            System.out.println("sua mensagem excede o limite de caracteres com: "+quant+" caracteres");
        }else if (quant==5){
        System.out.println("sua mensagem tem exatamente 5 caracteres");
                    }else {
        System.out.println("sua mensagem nao alcança o limite de caracteres com:"+quant+" caracteres");
    }
        
        
        
    }
}
