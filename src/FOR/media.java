/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FOR;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma=0;
        int num =0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("digite seu numero");
            num = sc.nextInt();
            soma += num;
        }
             int numTwo = (soma  /  5);   
        System.out.println("seu numero ficou"+numTwo);
        
    }
    
}
