/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class pokemonFogo extends pokemons{

    public pokemonFogo(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome+" usou lança chamas ");    }
    
}
