/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class passaigual {public static void main(String[] args) {
            Set<String> n = new HashSet<>();
            Set<String> n2 = new HashSet<>();
            Scanner sc = new Scanner(System.in);
            String passa;
            System.out.println("escreva o passatempo do primeiro usuario");
            for (int i = 0; i < 5; i++) {
               passa=sc.nextLine();
               n.add(passa);
            }
            sc.nextLine();
            System.out.println(" escreva a segunda lista");
            for (int i = 0; i < 5; i++) {
                passa=sc.nextLine();
                n2.add(passa);
            }
            HashSet<String> diferenca = new HashSet<>(n);
        diferenca.removeAll(n2); 
            System.out.println(diferenca);
    }
    
}
