/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class contagem {
    public static void c(int a){
        System.out.println(a);
        while(a>=1){
        a--;    
            System.out.println(a);
        }
      
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero inicial da contagem");
        int a =sc.nextInt();
  
        c(a);
          
                
    }
}
