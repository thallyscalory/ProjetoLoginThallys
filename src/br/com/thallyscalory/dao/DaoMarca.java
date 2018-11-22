/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.dao;

import br.com.thallyscalory.model.ModelMarca;
import br.com.thallyscalory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DaoMarca {
    private Connection conn;
    
    public DaoMarca() {
        this.conn = Conexao.getInstance().getConn();
    }
    
public void inserir(ModelMarca mar) {
   String sql = "insert into marca (titulo) values(?)";
   try {
        PreparedStatement p = this.conn.prepareStatement(sql);
        p.setString(1, mar.getTitulo());
        p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }
}
}
