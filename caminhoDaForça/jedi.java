/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caminhoDaForça;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class jedi {
    protected String nome;
    protected int nivelForça;

    public jedi(String nome, int nivelForça) {
        this.nome = nome;
        this.nivelForça = nivelForça;
    }
    
    public void usarForça(){
        System.out.println(this.nome+" esta a se concentrar na força");
    }
}
