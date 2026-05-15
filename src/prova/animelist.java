/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class animelist {

    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sai;
        System.out.println("digite sua lista de anime e digite sair para sair da lista");
        do {
            String na = sc.nextLine().toLowerCase();
            n.add(na);

        } while (!n.contains("sair"));
        n.remove("sair");
        l(n);
    }

    public static void l(ArrayList<String> n) {
        System.out.println("sua lista de anime");
        for (String li : n) {
            System.out.println(li);

        }
    }

}
