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
public class SENHA {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           double senha = 0;
            
            while(senha < 1234 || senha>1234){
                System.out.println("digite sua senha");
                senha = sc.nextDouble();
                
            }
                System.out.println("senha correta");
    }
    
}
