/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superhero;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class kryptoniano extends heroi implements voar{

    public kryptoniano(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        System.out.println(nome+" ergueu o punho e levantou voo para os céus em super velocidade!");
    }
    
}
