/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavobergamo.dal;

import java.sql.*;


/**
 *
 * @author gustavobergamo
 */
public class ModuloConexao {
    //método responsável por estabelecer a conexão com o Banco de dados
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //Estabelecendo conexão com banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/telalogin?user=root&password=");
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
