/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYLIST;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class cicades {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> n = new ArrayList<>();
            System.out.println("digite suas cidades");
            for (int i = 0; i < 5; i++) {
                String no=sc.nextLine();
                n.add(no);
            }
            Collections.shuffle(n);
            System.out.println(" as suas cidades sao");
            for(String l:n){
                System.out.println(l);
                
            }
    }
    
}
