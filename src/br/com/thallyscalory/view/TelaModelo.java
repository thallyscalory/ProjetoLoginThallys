/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.view;

import br.com.thallyscalory.model.ModelModelo;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class TelaModelo extends JInternalFrame {
    JLabel lb1;
    JTextField txt1;
    JButton btnSalvar, btnCancelar,btnMarca;
    ActionListener al;
    ModelModelo model;

public TelaModelo(ActionListener al) {
        super("Tela");
        this.al = al;
        setLayout(new GridLayout(0, 2));
        txt1 = new JTextField();
        setClosable(true);
        setResizable(true);
        lb1 = new JLabel("Modelo");
        btnSalvar = new JButton("Salvar!");
        btnCancelar = new JButton("Cancelar!");
        btnMarca = new JButton("Marca");
        
        this.add(lb1);
        this.add(txt1);
        
        this.btnSalvar.addActionListener(this.al);
        this.add(btnSalvar);
        this.add(btnCancelar);
        this.btnMarca.addActionListener(this.al);
        this.btnMarca.setActionCommand("marca");
        this.add(btnMarca);
}
    public ModelModelo getModel(){   
        this.model.setTitulo(this.txt1.getText());          
        return model;
    }
    public void setModel(ModelModelo model) {
        this.model = model;
    }
}
