/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.DaoLocacao;
import br.com.thallyscalory.model.ModelLocacao;
import br.com.thallyscalory.view.TelaCliente;
import br.com.thallyscalory.view.TelaLocacao;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerLocacao implements ActionListener {
    
     ModelLocacao ml;
     TelaLocacao teli;
     JDesktopPane abc;

    public ControlerLocacao(JDesktopPane desk) {
        this.teli = new TelaLocacao(this);
        ml = new ModelLocacao();
        this.abc = desk;
        desk.add(teli);
        teli.setModel(ml);
        teli.setVisible(true);
        teli.setSize(new Dimension(500,400));
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand()=="cadastrar"){
        ControlerCliente cc = new ControlerCliente(this.abc);
        }else if (e.getActionCommand()=="automovel"){
        ControlerAutomovel cm = new ControlerAutomovel(this.abc);
        }else{
        ModelLocacao mf = this.teli.getModel();    
        DaoLocacao dl = new DaoLocacao(); 
        dl.inserir(mf);
        JOptionPane.showInternalMessageDialog(this.teli, "Salvo com Sucesso!");
    }
    }
    
}
