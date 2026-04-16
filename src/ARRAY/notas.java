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
public class notas {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double notaFinal=0;
            double notas []= new double [5];
            for (int i = 0; i < notas.length; i++) {
                System.out.println(" digite suas notas");
                notas[i] = sc.nextDouble();
                notaFinal+=notas[i];
            }
           double med=notaFinal/5;
           for (double notasF:notas){
               System.out.println("suas notas foram "+notasF);
               
           }
                          System.out.println("sua media final ficou em "+med);

    }
    
}
