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
public class inverte2 {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num[]=new int[5];
            System.out.println("escreva sua lista");
            for (int i = num.length-1; i>=0; i--) {
                num[i]=sc.nextInt();
               
            }for(int n:num){
                System.out.println(n);
            }
    }
    
}
