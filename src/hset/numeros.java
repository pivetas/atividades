
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
public class numeros {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Set<Integer> n = new HashSet<>();
            int num;
            System.out.println("digite seus numeros");
            for (int i = 0; i < 5; i++) {
                num=sc.nextInt();
                n.add(num);
                
            }System.out.println(" sua lista tem "+n.size()+"nums");
    }
    
}
