/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author piveta
 */
public class maioremenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1[] = new int[10];
        int menor = 0;
        int maior = 0;
        System.out.println("digite seus numeros");
        for (int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
            menor = num1[i];
            maior = num1[i];
        }

        for (int num : num1) {
            if (num >= maior) {
                maior = num;
            }
            if (num <= menor) {
                menor = num;
            }
        }
        System.out.println("menor " + menor + " maior " + maior);
    }

}
