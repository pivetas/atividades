
package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digiter o dia da semana ");
        String dia= sc.nextLine();
        
         if (dia.equals ("segunda") || dia.equals ("terça") || dia.equals  ("quarta") || dia.equals  ("quinta") || dia.equals ("sexta")) {
        System.out.println("o dia "+dia+ "é dia util");
    } else if (dia.equals ("sabado")||dia.equals("domingo")) {
             System.out.println("nao é dia util");
         }else{
             System.out.println("dia invalido");
    }
        
        
        
        
        
        
        
        
        
        
        
    }
}
