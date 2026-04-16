
package aula3ifelse;

import java.util.Scanner;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class multa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a velociade ");
        int velo = sc.nextInt();
        
        
        if (velo > 80 ){
            System.out.println("sua multa será de "+(velo - 80)*5);
                
                }else{
            System.out.println("sem multa");
        }
        
        
        
        
        
        
        
        
        
        
    }
}
