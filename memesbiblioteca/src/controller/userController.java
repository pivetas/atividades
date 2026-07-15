/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import model.dao.dao;
import model.genero;
import model.genero;
import model.meme;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class userController {

    private dao dao = new dao();

    public void adicionarMeme(int nota, int id_c, String nome, String dataL) throws SQLException {
        dao.InserirMeme(nota, id_c, nome, dataL);
    }

    public void deletarMeme(String nome) {
        dao.deletarMeme(nome);
    }

    public void adicionarGenero(String genero) throws SQLException {
        dao.inserirGenero(genero);

    }

    public void deletarGenero(String genero) throws SQLException {
        dao.deletarGenero(genero);
    }

    public List<meme> ListarMemes() throws SQLException {
        return dao.ListarMemes();
    }

    public List<genero> ListarGenero() throws SQLException {
        return dao.ListarGeneros();
    }

    public void innerJoinCatalagoMemes() throws SQLException {
        dao.innerJoinCatalgoMemes();
    }
}
