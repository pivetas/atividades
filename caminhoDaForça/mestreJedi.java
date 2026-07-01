/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caminhoDaForça;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class mestreJedi extends jedi{
    private String corDoSabre;

    public mestreJedi(String corDoSabre, String nome, int nivelForça) {
        super(nome, nivelForça);
        this.corDoSabre = corDoSabre;
    }
      public void exibirMestre(){
          System.out.println("nome:"+this.nome+"\n força:"+nivelForça+"\n cor do sabre:"+this.corDoSabre);
      }
    
}
