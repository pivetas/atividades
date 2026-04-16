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
public class somanums {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num[]= new int [10];
            int soma=0;
            System.out.println("digite seus nuimeros");
            for (int i = 0; i < num.length; i++) {
                num[i]=sc.nextInt();
                soma+=num[i];
                
            }System.out.println("sua soma deu "+soma);
    }
    
}
