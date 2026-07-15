/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.userController;
import java.util.Scanner;
import bancoutil.bancoutil;
import java.sql.SQLException;
import java.util.List;
import model.genero;
import model.meme;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        userController controller = new userController();

        bancoutil.CriarTabelaCatalago();
        bancoutil.CriarTableMeme();

        int op = -1;
        while (op != 0) {
            System.out.println("##################"
                    + "\nMenu Crud"
                    + "\n0 para sair"
                    + "\n1° adicionar meme"
                    + "\n2° adicionar genero"
                    + "\n3° deletar meme"
                    + "\n4° deletar genero"
                    + "\n5° listar memes"
                    + "\n6° listar genero"
                    + "\n7° ver o genero do meme"
                    + "\nescolha uma opçao"
                    + "\n##################");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nome:");
                    String nomeInserir = sc.nextLine();

                    System.out.println("Nota:");
                    int notaInserir = Integer.parseInt(sc.nextLine().trim());

                    System.out.println("Data de lançamento AAAA/MM/DD");
                    String dataInserir = sc.nextLine();

                    System.out.println("digite o id do genero do meme, caso nao saiba o id, consule-no listar genero");
                    int inserirGenero = Integer.parseInt(sc.nextLine().trim());

                    controller.adicionarMeme(notaInserir, inserirGenero, nomeInserir, dataInserir);
                    break;
                case 2:
                    System.out.println("digite o genero que gostaria de adicionar ao catalago");
                    String generoCatalago = sc.nextLine();
                    controller.adicionarGenero(generoCatalago);
                    break;
                case 3:
                    System.out.println("digite o nome do meme que gostaria de excluir");
                    String nomeDel = sc.nextLine();
                    controller.deletarMeme(nomeDel);
                    break;
                case 4:
                    System.out.println("digite o genero que gostaria de deletar");
                    String generoDel = sc.nextLine();
                    controller.deletarGenero(generoDel);
                    break;
                case 5:
                    List<meme> memes = controller.ListarMemes();
                    if (memes.isEmpty()) {
                        System.out.println("nenhum meme listado");
                    } else {
                        System.out.println("-LISTA DE MEMES-");
                        for (meme u : memes) {
                            System.out.println(u);

                        }
                    }
                    break;
                case 6:
                    List<genero> generos = controller.ListarGenero();
                    if (generos.isEmpty()) {
                        System.out.println("nenhum genero catalogado");
                    } else {
                        System.out.println("-CATALOGO-");
                        for (genero u : generos) {
                            System.out.println(u);
                        }
                    }
                    break;
                case 7:
                    System.out.println("-GENEROS DO MEMES-");
                    controller.innerJoinCatalagoMemes();
                    break;
                case 0:
                    System.out.println("programa encerrado");
                    break;

                default:
                    System.out.println("opçao invalida");
                    break;
            }

        }

    }
}
