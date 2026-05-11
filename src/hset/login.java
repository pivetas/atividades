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
public class login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> n = new HashSet<>();
        int op;
        String user;
        do {
            System.out.println("digite 1 para adicionar novo usuario\n digite 2 para logar\n digite 3 para sair");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("cadastro\n digite o usuario");
                    user = sc.nextLine();
                    if (n.contains(user)) {
                        System.out.println("usuario ja existente");
                    } else {
                        n.add(user);
                        
                   
                    } break;
                case 2:System.out.println("login\n digite o usuario");
                user=sc.nextLine();
                    if(n.contains(user)){ 
                        System.out.println("bem vindo");
                    }else{
                        System.out.println("usuario nao existe, digite 1 para logar");
                    } break;
                case 3:
                   
                default:
                    System.out.println("opçao invalida");
                    break;
                    
            }
           
        } while(op!=3);
    System.out.println (" voce saiu");    
    }

   
    }
