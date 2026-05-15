/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class asilo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int op;
        int[][] m = new int[3][3];

        String mo[] = new String[6];

        Random rd = new Random();

   
        System.out.println("digite a quatidade de itens o nome dos teus itens");
        int q = sc.nextInt();

        for (int i = 0; i < q + 1; i++) {
            mo[i] = sc.nextLine();

        }

        do {
            System.out.println("escolha 1 para ver seus itens\n 2 para varrer mapa\n 0 sair ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    for (String mos : mo) {
                        System.out.println(mos);

                    }
                    break;
                case 2:
                         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rd.nextInt(2);

            }

        }
                         for (int i = 0; i < 3; i++) {
                             for (int j = 0; j < 3; j++) {
                                 System.out.print(m[i][j]+"\t");
                             }System.out.println("");
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (m[i][j] == 1) {
                                cont++;
                                

                            }
                        }
                    }
                    System.out.println("================\n"+cont+(q-5)+"\n==================");
                   if(){ 
                       
                    for (int i = q+1; i <cont+q+1 ; i++) {
                        mo[i]="muniçao";
                           
            }
                    
            }else{  cont-=cont;
                       System.out.println(cont);
                      System.out.println("mochila cheia");
                    
            
        }break;
        }
        }while (true);
    }
}
