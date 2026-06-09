
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {

    public static void main(String[] args) {
//      
//        pessoa p1 = new pessoa();
//        p1.nome ="pablo";
//        p1.idade= 18;
//        p1.altura = 1.70;        
//                
//         p1.apresentar();

// com interação
//Locale localBrasil=Locale.of("pt","br");
//Locale.setDefault (Locale.US);
//
     Scanner sc = new Scanner(System.in);
//         pessoa p1 = new pessoa();
//         
//         System.out.println(" digitge seu nome ");
//        p1.nome = sc.nextLine();
//        System.out.println("digite sua idade");
//        p1.idade = sc.nextInt();
//        System.out.println("digite sua altura");
//        p1.altura=sc.nextDouble();
//        
//        p1.apresentar();
    //atividade 2
//    contabancaria b1= new contabancaria();
//
//        System.out.println("digite o numero da sua conta");
//        b1.numero_conta=sc.nextLine();
//       
//        System.out.println("digite seu saldo atual");
//        b1.saldo = sc.nextInt();
//        System.out.println("digite seu nome");
//        sc.nextLine();
//        b1.titular=sc.nextLine();
//       
//        System.out.println("1 para depositar e 2 para sacar");
//        int escolha =sc.nextInt();
//        if(escolha==1){
//           b1.depositar();
//            
//        }else if (escolha==2){
//            b1.sacar();
//        }
//atividade[
alunos a1=new alunos(); 
        System.out.println("digite seu nome");
    a1.nome=sc.nextLine();
        System.out.println("digite sua matricula");
        a1.matricula=sc.nextInt();
        System.out.println("digite suas notas");
        for (int i = 0; i < a1.nota.length; i++) {
a1.nota[i]=sc.nextDouble();
        }
   a1.calcular();
    }
   
    
}
