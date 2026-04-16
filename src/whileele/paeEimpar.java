/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileele;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class paeEimpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
//        int rand = random.nextInt(6);
//        String sai = "sair";
//
//        while (!sai.equalsIgnoreCase("sair"));
//        System.out.println("digite seu numero entre 0 e 5");
//        System.out.println(rand);
//        int numA = sc.nextInt();
//        System.out.println("digite se vc quer par ou impar");
//        String esco = sc.next();
//        boolean par = (numA+rand)%2==0;
//     if(esco.equalsIgnoreCase("par"))
//         
//             

        String escolhaUsuario = "", escolhaComputador;
        int numeroUsuario, numeroComputador, soma;
        System.out.println("==JOGO PAR OU IMPAR");
        while (!escolhaUsuario.equalsIgnoreCase("sair")) {
            if (!escolhaUsuario.equalsIgnoreCase("sair")) {
                System.out.println("escolha par ou impar ou digite sair ");
            }
            escolhaUsuario = sc.nextLine();
            System.out.println("digite um numero de 0 a 5");
            numeroUsuario = sc.nextInt();
            numeroComputador = r.nextInt(6);
            soma = numeroComputador + numeroUsuario;
            if (escolhaUsuario.equalsIgnoreCase("par")) {
                escolhaComputador = "impar";
            } else {
                escolhaComputador = "par";
            }
            System.out.println("voce jogou" + numeroUsuario + "e escolheu" + escolhaUsuario);
            System.out.println("a maquina jogou" + numeroComputador + "e escolheu" + escolhaComputador);

            if (escolhaUsuario.equalsIgnoreCase("par") && soma % 2 == 0 || escolhaUsuario.equalsIgnoreCase("impar") && soma % 2 != 0) {
                System.out.println("voce ganhou");
            } else {
                System.out.println("vc perdeu");
            }

        }
        System.out.println("fim de jogo");
    }

}



