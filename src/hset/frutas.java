
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class frutas {public static void main(String[] args) {
            Set<String> n = new HashSet<>();
            Collections.addAll(n, "maça","banana","laranja");
            System.out.println(n);
            n.remove("maça");
            System.out.println("apos a mudança");
            System.out.println(n);
    }
    
}
