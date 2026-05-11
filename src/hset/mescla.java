/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author piveta
 */
public class mescla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> n = new HashSet<>();
        Set<String> n2 = new HashSet<>();
     
        String nomes;
        System.out.println("escreva os nomes da primeria lista");
        for (int i = 0; i < 5; i++) {
nomes=sc.nextLine();
n.add(nomes);
        }System.out.println("escreva os nomes da segunda lista");
        for (int i = 0; i < 5; i++) {
          nomes=sc.nextLine();
          n2.add(nomes);
  
        }
        Set<String> n3 = new HashSet<>(n);
      n3.retainAll(n2);
      if(n3.isEmpty()){
          System.out.println(" nenhum nome repetido");
          
      }else{
          System.out.println(" os nomes repetidos sao");
                  for(String repi:n3){
          System.out.println(repi);
      }
      }
    }

}
