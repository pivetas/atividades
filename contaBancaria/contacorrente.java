/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class contacorrente implements contaBancaria {

    private double valor;

    public contacorrente(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void depositar(double valor) {
        this.valor += valor;
    }

    @Override
    public void sacar(double valor) {
        this.valor -= valor;
    }

    public void ver() {System.out.println("saldo atual " + this.valor);
    }

}
