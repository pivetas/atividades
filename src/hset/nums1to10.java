
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
public class nums1to10 {public static void main(String[] args) {
            Set<Integer> n = new HashSet<>();
            Collections.addAll(n, 1,2,3,4,5,6,7,8,9,10);
            System.out.println(n);
            n.removeAll(n);
            System.out.println(n);
    }
    
}
