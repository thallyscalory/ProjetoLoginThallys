/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.DaoCliente;
import br.com.thallyscalory.model.ModelCliente;
import br.com.thallyscalory.view.TelaCliente;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerCliente implements ActionListener {
    
    TelaCliente tela;
    ModelCliente mc;
    

    public ControlerCliente(JDesktopPane desk) {
        this.tela = new TelaCliente(this);
        this.tela.setSize(500, 150);
        mc = new ModelCliente();
        tela.setModel(mc);
        desk.add(tela);
        tela.setVisible(true);
       // tela.setSize(new Dimension(500,400));
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        ModelCliente ma = this.tela.getModel();
        DaoCliente cli = new DaoCliente();
        cli.inserir(ma);
        JOptionPane.showInternalMessageDialog(this.tela, "Salvo com Sucesso!");
        this.tela.dispose();
    }
    
}
