/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.dao;

import br.com.thallyscalory.model.ModelAutomovel;
import br.com.thallyscalory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class DaoAutomovel {
    private Connection conn;
    
     public DaoAutomovel() {
        this.conn = Conexao.getInstance().getConn();
    }
     
 public void inserir(ModelAutomovel mau) {
   String sql = "insert into automovel (placa, cor, ano, tipoCombustivel,"
           + "kmAtual, renavam, chassis, vlocacaoHora, vlocacaoKm, situacao) values(?,?,?,?,?,?,?,?,?,?)";
   try {
        PreparedStatement p = this.conn.prepareStatement(sql);
        p.setString(1, mau.getPlaca());
        p.setString(2, mau.getCor());
        p.setString(3, mau.getAno());
        p.setString(4, mau.getTipoCombustivel());
        p.setString(5, mau.getKmAtual());
        p.setString(6, mau.getRenavam());
        p.setString(7, mau.getChassi());
        p.setString(8, mau.getValorLocacao_hora());
        p.setString(9, mau.getValorLocacao_km());
        p.setString(10, mau.getSituacao());
        p.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }
}
}

