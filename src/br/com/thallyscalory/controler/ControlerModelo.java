/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.DaoModelo;
import br.com.thallyscalory.model.ModelModelo;
import br.com.thallyscalory.view.TelaModelo;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerModelo implements ActionListener {

    TelaModelo tela;
    ModelModelo mm;
    JDesktopPane abc;
    
    public ControlerModelo(JDesktopPane desk) {
        this.tela = new TelaModelo(this);
        mm = new ModelModelo();
        tela.setModel(mm);
        this.abc = desk;
        desk.add(tela);
        tela.setVisible(true);
        tela.setSize(new Dimension(500,400));
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="marca"){
        ControlerMarca cma = new ControlerMarca(this.abc);
        }else{
        ModelModelo mmd = this.tela.getModel();    
        DaoModelo dm = new DaoModelo(); 
        dm.inserir(mmd);
        JOptionPane.showInternalMessageDialog(this.tela, "Salvo com Sucesso!");
    }
    }
}

