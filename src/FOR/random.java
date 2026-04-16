/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FOR;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class random {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(11);
        int num=0;
        int tentativa = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("digite seu numero");
             num = sc.nextInt();
            tentativa =+ i;
            if (num > rand) {
                System.out.println("o numero é menor");

            } else if (num < rand) {
                System.out.println("o numero é maior");
            } else  {
                System.out.println("você acertou na tentativa "+tentativa);
           return;
            }
        }
        
        System.out.println("digite seu numero");
        num=sc.nextInt();
          if (num > rand) {
                System.out.println("voce errou o numero é : " +rand+" recomece");
  
            } else if (num < rand) {
                System.out.println("voce errou o numero é: "  +rand+" recomece");
            }
    }
}