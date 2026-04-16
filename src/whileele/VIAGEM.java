/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileele;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class VIAGEM {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String chegou = "nao";
            
            while(!chegou.equalsIgnoreCase("sim")){
                System.out.println("ja chegamos");
                System.out.println("--responda ; sim ou nao");
                chegou = sc.nextLine();
            }
            System.out.println("chegamos");
            
    }
    
}
