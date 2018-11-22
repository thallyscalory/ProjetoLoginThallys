/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.UsuarioDao;
import br.com.thallyscalory.model.ModeloUsuario;
import br.com.thallyscalory.view.TelaCliente;
import br.com.thallyscalory.view.TelaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerMenu implements ActionListener{

    private TelaMenu telaMenu;
    private ModeloUsuario logado;
    
    public ControlerMenu(ModeloUsuario u) {
        this.logado = u;
        telaMenu = new TelaMenu();
        this.telaMenu.addControllerActionListener(this);
        this.telaMenu.getPainelInf().add(new JLabel("Usuario Logado: " + logado.getUsuario()));
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getActionCommand().equals("menuItemCliente")) {
          ControlerCliente contCliente  = new ControlerCliente(this.telaMenu.getDesktop());
       }
       if (e.getActionCommand().equals("menuItemLocacao")) {
          ControlerLocacao contLocacao  = new ControlerLocacao(this.telaMenu.getDesktop());
       }
       if (e.getActionCommand().equals("menuItemAutomovel")) {
          ControlerAutomovel contAutomovel = new ControlerAutomovel(this.telaMenu.getDesktop());
       }
       if (e.getActionCommand().equals("menuItemMarca")) {
          ControlerMarca contMarca  = new ControlerMarca(this.telaMenu.getDesktop());
       }
       if (e.getActionCommand().equals("menuItemModelo")) {
          ControlerModelo contModelo  = new ControlerModelo(this.telaMenu.getDesktop());
       }
        } 
    }
    
    
    

