
package whileele;

import java.util.Scanner;

public class mediaA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" digite a idade dos alunos ");

        int idad = 1;
        int soma = 0;
        int div = 0;

        while (idad >= 1) {
            idad = sc.nextInt();
         soma += idad;
            div++;
            
            System.out.println(soma);
            System.out.println(div );
        }
        int media = soma /(div-1);
        System.out.println(soma);
        System.out.println("a media das idades sera " + media);

    }

}
