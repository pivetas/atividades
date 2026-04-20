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
public class CALCULDORAM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
int total=0;
        ArrayList<Integer> n = new ArrayList<>();
       

        System.out.println("digite seus numeros");
        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            n.add(num);
           
        }
        for(int t:n){
            total+=t;
        }
                 double media=total/n.size();
        System.out.println("a media ficou"+media);

    }

}
