/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class personagemRPG {

    private String nome;
    private int pv;

    public personagemRPG(String nome, int pv) {
        this.nome = nome;
        this.pv = pv;
    }

   

    public String getNome() {
        return nome;
    }

    public int getPv() {
        return pv;
    }

    public void receberDano(int dano) {
        pv -= dano;
        if (pv<=0) {
            pv=0;
            System.out.println(nome+" foi derrotado");
        } else {
            System.out.println("te sobrou " + pv + "de dano");

        }

    }
}
