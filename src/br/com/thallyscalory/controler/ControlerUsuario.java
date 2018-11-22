/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.controler;

import br.com.thallyscalory.dao.UsuarioDao;
import br.com.thallyscalory.model.ModeloUsuario;
import br.com.thallyscalory.view.TelaLogin;
import br.com.thallyscalory.view.TelaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ControlerUsuario implements ActionListener{
    
    private TelaLogin minhaView;
    
 public ControlerUsuario() {
     minhaView = new TelaLogin();
     this.minhaView.addControllerActionListener(this);
     //ModeloUsuario model = new ModeloUsuario();
     //minhaView.setUsuario(model);
     //this.minhaView.addControlerActionListener(this);
     //this.minhaView.setVisible(true);
 }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("BtnEntrar")) {
            if (minhaView != null) {
                this.Autenticar();
            }
        }
        else if (e.getActionCommand().equals("BtnSair")) {
           System.exit(1); 
        }
    }
    
    private void getUser() {
        ModeloUsuario user = minhaView.getUsuario();
        user.getUsuario();
        minhaView.setUsuario(user);
    }
    
    private void Autenticar() {
        ModeloUsuario user = minhaView.getUsuario();
        UsuarioDao userD = new UsuarioDao();
        String Autentic = userD.Autenticar(user);
        
        this.autenticarNivel(Autentic);
    }
    
    public void autenticarNivel(String Autentic) {
        if (Autentic == null) {
            JOptionPane.showMessageDialog(null, "Erro! Usuário ou senha incorretos.");
        } else if (Autentic.equals("I")) {
            JOptionPane.showMessageDialog(null, "Usuário inativo!");
        } else {
            //JOptionPane.showMessageDialog(null, "LOGADO COM SUCESSO!");
            new ControlerMenu(minhaView.getUsuario());
            minhaView.dispose();
           
        }
    }
    
}
