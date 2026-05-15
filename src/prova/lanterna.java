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
public class lanterna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int bat=100;
       int op;
          while(bat>1){
              System.out.println("vc quer\n caminhar(perde 20% de bateria)\n recaregar(ganha 40% de bateria)");
              op=sc.nextInt();
              if(bat<=100){
                  switch (op){
                      case 1:
                          bat-=20;
                          System.out.println("bateria caiu para"+bat+"%");
                          break;
                      case 2: 
                          bat+=40;
                          System.out.println("bateria aumentou para"+bat+"%");
                      default:
                          bat-=5;
                          System.out.println("bateria perdeu 5% de pilha por opçao invalida");
                          break;
                  }
                          
                          }else{
                  System.out.println("bateria ultrapassou o limite e explodiu tente novamente");
                  bat=100;
              }
                 
      
    }System.out.println(" você perdeu ");
        
    }
}
