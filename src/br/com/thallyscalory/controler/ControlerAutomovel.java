/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.DaoAutomovel;
import br.com.thallyscalory.dao.DaoLocacao;
import br.com.thallyscalory.dao.DaoModelo;
import br.com.thallyscalory.model.ModelAutomovel;
import br.com.thallyscalory.model.ModelModelo;
import br.com.thallyscalory.view.TelaAutomovel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerAutomovel implements ActionListener {
    
     ModelAutomovel mau;
     TelaAutomovel teli;
     JDesktopPane abc;
     
     public ControlerAutomovel(JDesktopPane desk) {
        this.teli = new TelaAutomovel(this);
        mau = new ModelAutomovel();
        this.abc = desk;
        desk.add(teli);
        teli.setModel(mau);
        teli.setVisible(true);
        teli.setSize(new Dimension(500,400));
        
}
public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand()=="modelo"){
        ControlerModelo cm = new ControlerModelo(this.abc);
        }else{
        ModelAutomovel mmd = this.teli.getModel();    
        DaoAutomovel dm = new DaoAutomovel(); 
        dm.inserir(mmd);
        JOptionPane.showInternalMessageDialog(this.teli, "Salvo com Sucesso!");
    }
    }  
     
}
