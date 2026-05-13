/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class contapalavra {
    public static int q(String p){
        char[] l={'a','e','i','o','u'};
        int q=0;
        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < l.length; j++) {
                  if(p.charAt(i)==l[j]){
                      q++;
                  }
            }
          
        }return q;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua palavra");
        String p=sc.nextLine();
     int pa=q(p);
        System.out.println(pa);
    }
}
