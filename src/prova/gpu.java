/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class gpu {
    public static String r(int a, int b){
        int comprova=b-a;
        int comprav=a-b;
        if(comprova>15 || comprav>15){
            return "nao roda";
        }else{
            return "roda";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a nota da sua cpu");
        int notA=sc.nextInt();
        System.out.println("digite a nota da sua gpu");
        int notaB=sc.nextInt();
        
        String resultado=r(notA,notaB);
        System.out.println(resultado);
        
    }
    
}
