/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.dao;

import br.com.thallyscalory.model.ModelLocacao;
import br.com.thallyscalory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DaoLocacao {
    private Connection conn;
    
     public DaoLocacao() {
        this.conn = Conexao.getInstance().getConn();
    }
     
public void inserir(ModelLocacao mlc) {
   String sql = "insert into locacao (dataInicio, dataFim, kmInicio, kmFim,"
           + "kmRodado, tempoHoras, vlHora, vlKm, vlTotal, status) values(?,?,?,?,?,?,?,?,?,?)";
   try {
        PreparedStatement p = this.conn.prepareStatement(sql);
        p.setString(1, mlc.getHorainicio());
        p.setString(2, mlc.getHorafim());
        p.setString(3, mlc.getKmInicio());
        p.setString(4, mlc.getKmFim());
        p.setString(5, mlc.getKmRodado());
        p.setString(6, mlc.getTempoHoras());
        p.setString(7, mlc.getVlHora());
        p.setString(8, mlc.getVlKm());
        p.setString(9, mlc.getValorTotal());
        p.setString(10, mlc.getSituacao());
        p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }
}
}
