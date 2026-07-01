/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harryPoter;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
            System.out.println("digite o material e o nucleo da sua varinha");
            String madeira=sc.nextLine();
            String nucleo=sc.nextLine();
             sc.nextLine();
        varinha v1=new varinha(madeira, nucleo);
            System.out.println("escvreva o nome do seu bruxo");
          
            String nome=sc.nextLine();
            bruxo b1=new bruxo(nome, v1);
             sc.nextLine();
            System.out.println("escreva seu feiticio");
          
            String feiticio=sc.nextLine();
            
            b1.lançarFeiticio(feiticio);
        
    }
    
}
