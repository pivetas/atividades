/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoutil;

import java.sql.*;
import model.conexao;

/**
 *
 * @author PABLOSOMAVILLADEMELL
 */
public class bancoutil {

    public static void CriarTableMeme() throws SQLException {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "create table if not exists memes("
                    + "id int not null auto_increment primary key,"
                    + "nome varchar (100),"
                    + "nota enum ('0','1','2','3','4','5'),"                 
                    + "dataLancamento date," 
                    + "id_catalago int,"
                    + "foreign key (id_catalago) references catalago(id) "
                    + ");";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql)) {
                pst.execute();
                System.out.println("tabela 'memes' criada com sucesso");
            } catch (SQLException e) {
                System.out.println("erro ao criar tabela 'memes'" + e.getMessage());
            } finally {
                try {
                    conexaoU.close();
                } catch (SQLException e) {
                    System.out.println("erro ao fechar conexao" + e.getMessage());

                }

            }

        }

    }

    public static void CriarTabelaCatalago() throws SQLException {
        Connection conexaoU = conexao.getconexao();
        if (conexaoU != null) {
            String sql = "create table if not exists catalago("
                    + "id int not null auto_increment primary key,"
                    + "genero varchar (100)"
                    + ");";
            try (PreparedStatement pst = conexaoU.prepareStatement(sql)) {
                pst.execute();
                System.out.println("tabela catalago criada com sucesso");
            } catch (SQLException e) {
                System.out.println("erro ao criar tabela 'catalago'" + e.getMessage());
            } finally {
                try {
                    conexaoU.close();

                } catch (SQLException e) {
                    System.out.println("erro ao fechar conexao" + e.getMessage());
                }
            }
        }
    }
}