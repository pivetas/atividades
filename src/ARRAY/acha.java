/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class acha {public static void main(String[] args) {
            Random rd = new Random();
    int num[]=new int[100];
            Scanner sc = new Scanner(System.in);
            int conta=0;
            for (int i = 0; i < num.length; i++) {
                num[i]=rd.nextInt(10)+1;
                
            }System.out.println("escreva o num que vc quer encontrar");
             
            int numE=sc.nextInt();
            for(int cont : num){
                System.out.println(cont);
                if(cont==numE){
                    conta++;
                }
            }
            System.out.println("seu numero se repete "+conta+" vezes "); }
    
}
