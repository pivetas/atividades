/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class somador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        char resp ;
        
        do{ 
            System.out.println("digite o valor pra ser somado ");
            int num = sc.nextInt();
            soma +=num;
            System.out.println("vc quer continuar? [s ou n ]");
            resp = sc.next().toLowerCase().charAt(0);
        } while (resp!= 'n');
        System.out.println("a soma deu"+soma);
            
            
        }
    }
    
