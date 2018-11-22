/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.dao;

import br.com.thallyscalory.model.ModelCliente;
import br.com.thallyscalory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DaoCliente {
     private Connection conn;
     
      public DaoCliente() {
        this.conn = Conexao.getInstance().getConn();
    }
      
public void inserir(ModelCliente m) {
    String sql = "insert into pessoa (nome, cpf, status) values(?,?,?)";
    try {
        PreparedStatement p = this.conn.prepareStatement(sql);
        p.setString(1, m.getNome());
        p.setString(2, m.getCpf());
        p.setString(3, m.getStatus());
        p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }
    
    
}
    
}
