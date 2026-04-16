package dowhile;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class menuJogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoEs;
        System.out.println("bem vindo ao sistema do jogo");

        do {
            System.out.println("MENU ESCOLHA");
            System.out.println("1 iniciar nova partida ");
            System.out.println("2 ver recordes");
            System.out.println("0 sair do jogo");
            System.out.println("escolha uma opçao");
            opcaoEs = sc.nextInt();
            if (opcaoEs == 1) {
                System.out.println("carregando a fase1 ");
            } else if (opcaoEs == 2) {
                System.out.println("seu record : 9999 pontos");
            }

        } while (opcaoEs != 0);
        System.out.println("até mais");
    }
}

