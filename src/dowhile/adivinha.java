/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class adivinha {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            int escolha=0;
            int rand = rd.nextInt(100)+1;
            int contador=0;
            do{
                System.out.println("tentativa " +(contador+1));
                System.out.println("escolha seu numero ");
                escolha=sc.nextInt();
                if (escolha>rand){
                    System.out.println("o numero é menor");
                    
                }else if (escolha<rand){
                    System.out.println("o numero é maior");
                }
                contador++;
                
                
            }while(escolha!=rand);
            System.out.println("parabens vc acertou");
    }
    
}
