/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.view;

import br.com.thallyscalory.model.ModeloUsuario;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class TelaLogin extends JFrame{
    
    private ModeloUsuario usuario;
    private JTextField TxtLogin;
    private JPasswordField TxtSenha;
    private JButton BtnEntrar, BtnSair;

    public TelaLogin() throws HeadlessException {
        super("Login");
        init();
        showMe();
    }

    private void init() {
        usuario = new ModeloUsuario();
        this.setLayout(new GridLayout(3,2));
        
        JLabel LblUsuario = new JLabel("Usuario:");
        this.add(LblUsuario);
        
        TxtLogin = new JTextField();
        this.add(TxtLogin);
        
        JLabel LblSenha = new JLabel("Senha:");
        this.add(LblSenha);
        
        TxtSenha = new JPasswordField();
        this.add(TxtSenha);
        
        BtnEntrar = new JButton("Entrar");
        BtnEntrar.setActionCommand("BtnEntrar");
        this.add(BtnEntrar);
        
        BtnSair = new JButton("Sair");
        BtnSair.setActionCommand("BtnSair");
        this.add(BtnSair);
    }

    private void showMe() {
        this.setSize(400,200);;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
     public ModeloUsuario getUsuario() {
        usuario.setUsuario(TxtLogin.getText());
        usuario.setSenha(new String(TxtSenha.getPassword()));
        return usuario;
    }
    public void setUsuario (ModeloUsuario usuario) {
        if (usuario.getUsuario() == ""){
            JOptionPane.showMessageDialog(null, "O usuário deve ser informado!");
        }
        this.usuario = usuario;
    }
    
    public void addControllerActionListener(ActionListener al) {
        BtnEntrar.addActionListener(al);
        BtnSair.addActionListener(al);
    }
    
    
    
    
    
}
