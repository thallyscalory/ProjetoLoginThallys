/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.dao;

import br.com.thallyscalory.model.ModelModelo;
import br.com.thallyscalory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DaoModelo {
    private Connection conn;
    
    public DaoModelo() {
        this.conn = Conexao.getInstance().getConn();
    }
    
public void inserir(ModelModelo mmd) {
   String sql = "insert into modelo (titulo) values(?)";
   try {
        PreparedStatement p = this.conn.prepareStatement(sql);
        p.setString(1, mmd.getTitulo());
        p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }
}
}
