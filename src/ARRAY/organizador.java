/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author piveta
 */
public class organizador {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            String[] frutas= new String [5];
           
            System.out.println("digite as frutas que vc quer colocar");
            for (int i = 0; i < frutas.length; i++) {
                frutas[i] = sc.nextLine();
                
            }
            Arrays.sort(frutas);
            for( String lista : frutas){
                System.out.println(lista);
            }
       
            
    }
    
}
