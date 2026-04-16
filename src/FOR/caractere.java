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
public class caractere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu numero");
        char num = sc.next().charAt(0);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
           
            System.out.println(num);
        }
  
        
        
    }

}
