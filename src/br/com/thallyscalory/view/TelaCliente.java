/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.view;

import br.com.thallyscalory.model.ModelCliente;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class TelaCliente extends JInternalFrame {
    JTextField txtNome, txtCpf;
    JCheckBox status;
    JButton btnSalvar, btnCancelar;
    JLabel lba,lbi;
    ModelCliente model;
    ActionListener al;

 

    public TelaCliente(ActionListener al) {
        super("Tela");
        this.al = al;
        setLayout(new GridLayout(0, 2));
        txtNome = new JTextField();
        txtCpf = new JTextField();
        status = new JCheckBox();
        lba = new JLabel("Ativo");
        lbi = new JLabel("Inativo");
        btnSalvar = new JButton("Salvar!");
        btnCancelar = new JButton("Cancelar!");
        setClosable(true);
        setResizable(true);
        
      

        this.add(new JLabel("Nome"));
        this.add(txtNome);

        this.add(new JLabel("Cpf"));
        this.add(txtCpf);
        
        this.add(lba);
        this.add(status);

        this.btnSalvar.addActionListener(this.al);
        this.add(btnSalvar);
        this.add(btnCancelar);

        this.pack();

    }

    public ModelCliente getModel() {
        this.model.setNome(this.txtNome.getText());
        this.model.setCpf(this.txtCpf.getText());
        if (this.status.isSelected()) {
            this.model.setStatus("A");
        }else{
            this.model.setStatus("I");
        }
        return model;
    }

    public void setModel(ModelCliente model) {
        this.model = model;
    }
    
    

   
}
