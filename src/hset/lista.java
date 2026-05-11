package hset;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author piveta
 */
public class lista {public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

    Set<Integer> n = new HashSet<>();
            int tl=0;
            int nums;
            System.out.println("escreva o tgamanho da sua lista");
            tl =sc.nextInt();
            System.out.println("escreva os itens da sua lista");
            for (int i = 0; i < tl; i++) {
                nums=sc.nextInt();
                n.add(nums);
            }System.out.println("sua lista fiocou"+n);
    }

}
