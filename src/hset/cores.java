
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class cores {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Set<String> n = new HashSet<>();
            String op;
            System.out.println("digite suas cores e cidades");
            for (int i = 0; i < 4; i++) {
                op=sc.nextLine();
                n.add(op);
            }System.out.println(" sua lista ficou"+n);
    }
    
}
