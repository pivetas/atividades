package aula3ifelse;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class vogais {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma palavra");
        String palavra = sc.nextLine().toLowerCase();
        String plv = palavra.toLowerCase();
        String vogais = plv.replaceAll("[^aeiouàèìòùáéíóúâêîôû]", "");
        int quant = vogais.length();
        System.out.println("sua palavra tem "+quant+ " vogais");
      
        }
    }





