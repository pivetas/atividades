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
public class notaAluno {
    public static String v(int a){
        if(a>=7){
            return "simpassou";
        }else{
            return "naopassou";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva sua nota");
        int  a=sc.nextInt();
        System.out.print(v(a)+"\n");         
    }
    
}
