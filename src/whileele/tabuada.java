/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileele;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class tabuada {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
       
            int quant= 0;
            System.out.println("digite o numero que vc quer");
           int tabu= sc.nextInt();
            while (quant < 10 && tabu >0 ){
            quant++;
             System.out.println(tabu*quant);
            }
    }
    
}
