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
public class mediaID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        int soma= 0;
        for (int i=0; i<=4; i++) {
            System.out.println("digite as idades");
            id = sc.nextInt();
            soma += id;
        }
                int med = (soma/5);
                System.out.println("a media sera:" +med);
        
    }
    
}
