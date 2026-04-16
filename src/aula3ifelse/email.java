
package aula3ifelse;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite seu email");
        String email = sc.nextLine();
        if (email.contains(".com") && email.contains("@")) {
            System.out.println("Email válido.");
        } else {
            System.out.println("Email inválido.");
        }
    }
    
}
