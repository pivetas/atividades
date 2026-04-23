
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
public class vazio {public static void main(String[] args) {
            Set<Integer> n = new HashSet<>();
            Collections.addAll(n, 1,2,3,4,5);
            System.out.println(n);
            n.clear();
      
            System.out.println("esta vazio"+n.isEmpty());
    }
    
}
