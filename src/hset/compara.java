
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class compara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> n = new HashSet<>();
        Set<String> n2 = new HashSet<>();
        String op;
        Collections.addAll(n, "tramandai", "osorio", "imbe");
        System.out.println("digite suas cidades");
        for (int i = 0; i < 3; i++) {
            op = sc.nextLine();
            n2.add(op);
        }
        for (String np : n) {
            if (n2.contains(np))
            {
                System.out.println(" contem a cidade");
            }else {
                    System.out.println("nao contem a cidade");
                    }
        }
    }

}
