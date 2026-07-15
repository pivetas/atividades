package model.dao;

import model.genero;
import model.meme;
import model.conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dao {

    public void InserirMeme(int nota, int id_c, String nome, String dataL) throws SQLException {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "insert into memes (nome, id_catalago, nota, dataLancamento) values (?,?,?,?); ";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql)) {
                pst.setString(1, nome);
                pst.setInt(2, id_c);
                pst.setInt(3, nota);
                pst.setString(4, dataL);
                pst.executeUpdate();
                System.out.println("meme inserido com sucesso");
            } catch (SQLException e) {
                System.out.println("erro ao inserir meme " + e.getMessage());

            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar a conexao" + e.getMessage());
                }
            }
        }
    }

    public void deletarMeme(String nome) {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "delete from memes where nome = ? limit 1;";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql)) {
                pst.setString(1, nome);
                pst.execute();
                System.out.println("meme excluido com sucesso");
            } catch (SQLException e) {
                System.out.println("erro ao deletar o meme" + e.getMessage());

            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar a conexao");
                }
            }
        }
    }

    public void inserirGenero(String genero) throws SQLException {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "insert into catalago (genero) values (?);";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql)) {
                pst.setString(1, genero);
                pst.execute();
                System.out.println("genero inserido com sucesso");
            } catch (SQLException e) {
                System.out.println("erro ao inserir genero" + e.getMessage());
            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar conexao" + e.getMessage());
                }
            }
        }
    }

    public void deletarGenero(String genero) throws SQLException {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "delete from catalago where gereno=?; ";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql)) {
                pst.setString(1, genero);
                pst.execute();
                System.out.println("genero excluido com sucesso");
            } catch (SQLException e) {
                System.out.println("erro ao deletar genero" + e.getMessage());
            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar conexao" + e.getMessage());
                }
            }
        }

    }

    public List<meme> ListarMemes() throws SQLException {
        List<meme> memes = new ArrayList<>();
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "select * from memes;";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    meme meme = new meme();
                    meme.setId(rs.getInt("id"));
                    meme.setNome(rs.getString("nome"));
                    meme.setNota(rs.getInt("nota"));
                    meme.setDataL(rs.getString("dataLancamento"));
                    meme.setId_c(rs.getInt("id_catalago"));
                    memes.add(meme);

                }
            } catch (SQLException e) {
                System.out.println("erro ao listar o usuario" + e.getMessage());
            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar conexao" + e.getMessage());
                }
            }

        }
        return memes;
    }

    public List<genero> ListarGeneros() throws SQLException {
        List<genero> generos = new ArrayList<>();
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "select * from catalago;";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    genero Genero = new genero();
                    Genero.setId(rs.getInt("id"));
                    Genero.setGenero(rs.getString("genero"));

                    generos.add(Genero);

                }
            } catch (SQLException e) {
                System.out.println("erro ao listar o usuario" + e.getMessage());
            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar conexao" + e.getMessage());
                }
            }

        }
        return generos;
    }

    public void innerJoinCatalgoMemes() throws SQLException {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "select m.nome, c.genero "
                    + "from memes as m inner join catalago as c "
                    + "on c.id = m.id_catalago;";
            System.out.println("lista de memes e seus generos");
            try (PreparedStatement pst = conexaoU.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    String genero = rs.getNString("genero");
                    System.out.println("nome: " + nome + "\ngenero:" + genero);
                }
            } catch (SQLException e) {
                System.out.println("Erro ao deletar o usuário: " + e.getMessage());
            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar conexão: " + e.getMessage());
                }
            }
        }

    }
}
