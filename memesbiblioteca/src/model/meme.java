/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class meme {
    private int id, nota,id_c;
    private String nome, dataL;
    
    public meme(){}

    public meme(int nota, int id_c, String nome, String dataL) {
        this.nota = nota;
        this.id_c = id_c;
        this.nome = nome;
        this.dataL = dataL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataL() {
        return dataL;
    }

    public void setDataL(String dataL) {
        this.dataL = dataL;
    }

    @Override
    public String toString() {
        return "meme{" + "id=" + id + ", nota=" + nota + ", id_c=" + id_c + ", nome=" + nome + ", dataL=" + dataL + '}';
    }

    
    
}

    
