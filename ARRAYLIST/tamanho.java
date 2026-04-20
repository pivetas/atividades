/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class tamanho {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Character> n = new ArrayList<>();
            n.add('c');
            n.add('n');
            n.add('m');
            n.add('l');
            System.out.println("a lista tem" +n.size()+ "numeros");
            System.out.println("os caracteres sao");
            for(char l:n){
                System.out.println(l);
            }
            
    }
    
}
