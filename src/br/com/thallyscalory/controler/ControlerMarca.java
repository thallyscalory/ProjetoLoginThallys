/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.DaoMarca;
import br.com.thallyscalory.dao.DaoModelo;
import br.com.thallyscalory.model.ModelMarca;
import br.com.thallyscalory.view.TelaMarca;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerMarca implements ActionListener {

    TelaMarca tela;
    ModelMarca mar;
    JDesktopPane abc;
    
    public ControlerMarca(JDesktopPane desk) {
        this.tela = new TelaMarca(this);
        mar = new ModelMarca();
        tela.setModel(mar);
        this.abc = desk;
        desk.add(tela);
        tela.setVisible(true);
        tela.setSize(new Dimension(500,400));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ModelMarca marc = this.tela.getModel();    
        DaoMarca dm = new DaoMarca(); 
        dm.inserir(marc);
        JOptionPane.showInternalMessageDialog(this.tela, "Salvo com Sucesso!");
    }

}
