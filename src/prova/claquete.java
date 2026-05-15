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
public class claquete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] n = new String[3] [3];
        System.out.println("digite seus topicos");
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                if(j==0){
                    System.out.println("digite seu filme");
                    n[i][j]=sc.nextLine();
                   
                }else if(j==1){
                System.out.println("digite o genero ");
                n[i][j]=sc.nextLine();
            }else if(j==2){
                    System.out.println("digite a nota do filme");
                n[i][j]=sc.nextLine();
            }
                
            }
            
        }for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j]+"\t");
        }System.out.println("");
        }
    }
   
    
    
    
    
}
