
package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class mediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("primeira nota");
        double n1 = sc.nextDouble();
        System.out.println("segunda nota");
        double n2 = sc.nextDouble();
        double media= (n1+n2)/2;
        System.out.printf("a media do aluno é: %.2fn",media);
        
        
        if(media >=7){
            System.out.println("aluno aprovado");
        }else if (media >= 5){
            System.out.println("aluno em recuperaçao");
        }else {
            System.out.println("aluno reprovado");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
