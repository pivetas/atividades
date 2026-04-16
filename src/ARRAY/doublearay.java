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
public class doublearay {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1[]=new int[5];
                  int num2[]=new int[5];
                  int junto[]= new int [num1.length+num2.length];
                  System.out.println("digite os numeros da primeira lista");
                  for (int i = 0; i < num1.length; i++) {
                num1[i]=sc.nextInt();
                 junto[i] = num1[i];
            }System.out.println("escreva a segunda lista");
            for (int i = 0; i < num2.length; i++) {
                num2[i]=sc.nextInt();
                 junto[num1.length + i] = num2[i];
            }for(int le:junto){
                System.out.println(le);
            }
    
}
    
}
