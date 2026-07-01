/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public abstract class pokemons {
    protected String nome;

    public pokemons(String nome) {
        this.nome = nome;
    }
    public abstract void atacar();
    
}
