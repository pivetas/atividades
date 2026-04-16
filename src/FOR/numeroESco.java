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
public class numeroESco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero, a quantidade de repetiçoes e o incremento");
        int num = sc.nextInt();
        int quant = sc.nextInt();
        int quantInc = sc.nextInt();
        if (num > quant){
        for (int i = 1; i <= quant; i += (quantInc)) {
            System.out.println(num);}

        }
    }
}
