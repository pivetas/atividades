/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhile;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class contagem {public static void main(String[] args) throws InterruptedException {
    int contador =(10)+1;
    do{

        Thread.sleep(1000);
contador--;
        System.out.println(contador);
        
    }while(contador !=0 );
            System.out.println(" a conta terminou");
    }
    
}
