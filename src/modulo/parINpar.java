/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class parINpar {
    public static boolean v(int a){

      return a%2==0;
          
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu numero");
        int n=sc.nextInt();
        if(v(n)){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
