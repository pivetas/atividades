/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class inverte {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("escreva a palavra que vc quer inverter");
            String plv= sc.nextLine();
            String invertida = new StringBuilder(plv).reverse().toString();
            char[] letras =plv.toCharArray();
            for (int i = letras.length -1; i >= 0 ; i--) {
                System.out.println(letras[i]);

            }
                
                               System.out.println("ou "+invertida); 
            }
            
            
    }
    

