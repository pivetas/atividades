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
public class dobrA {
   public static int d(int a){
       do{
        a=   a*2;
       }while(a<100);
       return a;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite seu numero");
        int a =sc.nextInt();
        System.out.println("seu numero ficou"+(d(a)));
        
    }
}
