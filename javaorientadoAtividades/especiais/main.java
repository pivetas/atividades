/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package especiais;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" crie o seu pop funko digitando as informaçoes a baixo");
        System.out.println("nome do personagem");
        String nome = sc.nextLine();
        System.out.println("digiter a franquia do seu pop funko");
        String franquia=sc.nextLine();
        System.out.println("numero de identificaçao");
        int numero=0;
        if(sc.hasNextInt()){
            numero=sc.nextInt();
            sc.nextLine();
        }else{
            System.out.println("entrada invalida");
            sc.nextLine();
        }
        System.out.println("o funko esta na caixa s/n");
        String resposta=sc.nextLine().toUpperCase();
        boolean naCaixa = resposta.startsWith("s");
        
        popfunko p1=new popfunko(nome, franquia, numero, naCaixa);
        p1.exibirDetalhes();
        
        int menu=0;
        
        do{
            System.out.println("menu interativo do "+p1.getPersonagem());
            System.out.println("1 tirar da caixa\n2 guardar na caixa \n3 encerrar programa\nescolha a opçao");
           // int op=sc.nextInt();
            
            
            
            
            
            
            
            
            
            switch (menu) {
                case 1:
                        p1.tiraDaCaixa();
                        p1.exibirDetalhes();
                       break;
                case 2:
                    p1.colocar();
                    p1.exibirDetalhes();
            }
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        popfunko p1 = new popfunko("gugu", "DBZ", 500, true);
//        p1.exibirDetalhes();
//        
//        System.out.println("tirando da caixa");
//        p1.tiraDaCaixa();
//        p1.exibirDetalhes();
//        
//        
//        System.out.println("modificando numero");
//        p1.setNumero(10);
//        p1.exibirDetalhes();
    }

    public main() {
    }
    
}
