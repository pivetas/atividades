
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class alunos {
    String nome;
    int matricula;
    double nota[]=new double[5];
    
    void calcular(){
        double media=0;
            for (int i = 0; i < nota.length; i++) {
                media+=nota[i];
                
            }
            double media_Feita=media/nota.length;
            System.out.println(media_Feita);
    }
    
}
