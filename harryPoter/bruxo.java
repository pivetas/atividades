/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harryPoter;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class bruxo {
    private String nome;
    private varinha varinha;

    public bruxo(String nome, varinha varinha) {
        this.nome = nome;
        this.varinha = varinha;
    }
    public void lançarFeiticio(String feitico){
        System.out.println(this.nome+" agitou sua varinha de "+this.varinha.getMadeira()+" e lançou "+ feitico);
        
    }
}
