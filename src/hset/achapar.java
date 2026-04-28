/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class achapar {public static void main(String[] args) {
            Set<Integer> n = new HashSet<>();
            Scanner sc = new Scanner(System.in); 
            int num;
            System.out.println("digite seus numeros");
            for (int i = 0; i < 5; i++) {
                num=sc.nextInt();
                n.add(num);
                
            }System.out.println("lista somente com pares");
            for(int l:n){
                if( l % 2==0){
                    System.out.println(l);
                }
            }
    }
    
    
}
