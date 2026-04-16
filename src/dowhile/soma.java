/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doWhile;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class soma
{public static void main(String[] args) {Scanner sc = new Scanner(System.in);
int num = 0;
int soma=0;
do{
    System.out.println("digite o numero que vc quer somar");
   num=sc.nextInt();
    soma+=num;
    
}while(num !=0);
            System.out.println(" a soma dos numeros ficou "+soma);
            
    }
    
}
