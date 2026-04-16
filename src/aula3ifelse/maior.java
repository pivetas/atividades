
package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite seu numero");
        int num1= sc.nextInt();
        System.out.println("digite seu segundo numero");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println("seu primeiro numero: "+num1+" é maior que seu segundo numero:"+num2);
        }else if(num1 == num2){
            System.out.println("os dois numeros sao iguais");
        }
                else {
        System.out.println("seu segundo numero: "+num2+" é maior que seu primeiro numero: "+num1);
    }
        
        
        
        
    }
}
