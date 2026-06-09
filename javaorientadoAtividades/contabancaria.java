
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class contabancaria {
    String numero_conta;
    double saldo;
   String titular;
   Scanner sc = new Scanner(System.in);
   void depositar(){
       
       
       
       System.out.println(" digite o valor do deposito");
     double   valor_deposito=sc.nextDouble();
       saldo+=valor_deposito;
       System.out.println("sua conta tem "+saldo+"rs no momento");
       
   }
   void sacar(){
       
    
       System.out.println("digite quanto vc quer sacar");
        double saque=sc.nextDouble();
        saldo-=saque;
        System.out.println("seu saldo atual é de "+saldo+"rs");
       
   }
           
    
}
