/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controledeestoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class ControleDeEstoque {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gestaodeestoque";
        String usuario = "root";
        String senha = "!@#$%¨&*(";

        try {
            // Estabelecendo a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida!");

            // Fechando a conexão
            conexao.close();
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
        FramePrincipal frame = new FramePrincipal();
        
        frame.setVisible(true);
        
        
}
}
