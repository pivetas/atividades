/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package especiais;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class popfunko {
    
   private String Personagem, Franquia;
   private int numero;
  private boolean naCaixa;
  
  
  
  //padrao
//  
//
//    public popfunko() {
//        this.Personagem ="indef";
//        this.Franquia = "indef";
//        this.numero = numero;
//        this.naCaixa = naCaixa;
//    }
   
    
  
  
  
  
  
  
  
  //parametrizado

    public popfunko(String Personagem, String Franquia, int numero, boolean naCaixa) {
        this.Personagem = Personagem;
        this.Franquia = Franquia;
       //set numero
        this.numero = numero;
        this.naCaixa = naCaixa;
    }

    public String getPersonagem() {
        return Personagem;
    }

    public void setPersonagem(String Personagem) {
        this.Personagem = Personagem;
    }

    public String getFranquia() {
        return Franquia;
    }

    public void setFranquia(String Franquia) {
        this.Franquia = Franquia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero>=0){this.numero = numero;
    }else{
            System.out.println("erro");
            this.numero=0;
        }
    }
    public boolean isNaCaixa() {
        return naCaixa;
    }

    public void setNaCaixa(boolean naCaixa) {
        this.naCaixa = naCaixa;
    }
   
    
    
    
    //metodo de comportamento
    
    public void tiraDaCaixa(){
        if (this.naCaixa){
            this.naCaixa=false;
            System.out.println("vc tirou o"+this.Personagem+"da caixa");
            
        }else{
            System.out.println(this.Personagem+"ja esta fora na caixa");
        }
    }
   
    public void exibirDetalhes(){
        System.out.println("personagem "+this.Personagem+"\n franquia "+this.Franquia+"\n numero "+this.numero+"\n esta na caixa "+(this.naCaixa ? "sim":"Nao"));
    }
    
    
    
    
}
