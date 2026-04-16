/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class busca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]=new int [100];
       int cont=0;
          Random rd= new Random();
          for (int i = 0; i < nums.length; i++) {
                    nums[i]=rd.nextInt(100)+1;
        }
        System.out.println("digite o numero que vc quer encontrar");
           int esco=sc.nextInt();
           for (int i = 0; i < nums.length; i++) {
               cont++;
            if(nums[i]==esco){
                System.out.println("o numero "+esco+" se encontra na posição "+cont);
            }
        }
    }
}
