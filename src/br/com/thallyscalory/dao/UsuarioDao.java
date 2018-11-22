/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.dao;

import br.com.thallyscalory.Conexao;
import br.com.thallyscalory.model.ModeloUsuario;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class UsuarioDao {
 
    private Connection conn;

    public UsuarioDao() {
        this.conn = (Connection) Conexao.getInstance().getConn();
    }
    
    public String Autenticar(ModeloUsuario user) {
        ModeloUsuario usuario = user;
        String sql = "select login, senha, status from usuario where login=? and senha=?;";
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getSenha());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getString("status");
            } else {
                return null;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    
    
}
