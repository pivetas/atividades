/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2;

import java.util.Random;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class media {public static void main(String[] args) {
         int nums[]=new int [10];
  
       int soma=0;
     
       int c=0;
          Random rd= new Random();
          for (int i = 0; i < nums.length; i++) {
                    nums[i]=rd.nextInt(30)+1;
                    soma+=nums[i];
        }          int media=soma/10;

          System.out.println("A media é "+media);
          for(int n:nums){
              c++;
            if(n>media){
                System.out.println("o numero "+n+" na posiçao "+c +" esta acima da media");
            }
    }
    
}
}