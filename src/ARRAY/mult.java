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
public class mult {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num[]=new int[5];
            System.out.println("digite 5 numero que vc quer multiplicar por 2");
            for (int i = 0; i < num.length; i++) {
                num[i]=sc.nextInt();
            }for(int mult : num){
                System.out.println(mult*2);
            }
                
    }
    
}
