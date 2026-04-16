/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FOR;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class contVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" digite sua palavra ");
        String plv = sc.nextLine();
          String vogais = "aeiouAEIOUáéíóúÁÉÍÓÚãõÃÕÂÊÎÔÛâêîôû";

        int cont = 0;
        for (int i = 0; i < plv.length(); i++ ){
            char c = plv.charAt(i);
            if ( vogais.contains(String.valueOf(c))) {
            cont++;
            System.out.println("letra" +(i+1)+ " é: " +c);
        }
        
        }
                
        System.out.println("numero de vogais: "+cont);
        
    }
    
}
