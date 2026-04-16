/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Random;

/**
 *
 * @author piveta
 */
public class media {public static void main(String[] args) {
        double[] num= new double[5];
           Random rd = new Random();
          double media=0;
            for (int i = 0; i < num.length; i++) {
                num[i]=rd.nextDouble(100)+1;
                media+=num[i];
                
            }
            System.out.printf("%.2f%n", media/5
           );
    }

        
    
}
