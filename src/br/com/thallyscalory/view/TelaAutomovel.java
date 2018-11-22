/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.view;

import br.com.thallyscalory.model.ModelAutomovel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class TelaAutomovel extends JInternalFrame {

    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10,lbv;
    JButton btnSalvar, btnCancelar, btnCliente,btnmodelo;
    ModelAutomovel model;
    ActionListener al;

    public TelaAutomovel(ActionListener al) {
        super("Tela");
        this.al = al;
        setLayout(new GridLayout(0, 2));       
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        txt4 = new JTextField();
        txt5 = new JTextField();
        txt6 = new JTextField();
        txt7 = new JTextField();
        txt8 = new JTextField();
        txt9 = new JTextField();
        txt10 = new JTextField();
        setClosable(true);
        setResizable(true);
        lb1 = new JLabel("Placa");
        lb2 = new JLabel("Cor");
        lb3 = new JLabel("Ano");
        lb4 = new JLabel("Tipo de Combustivel");
        lb5 = new JLabel("Km Atual");
        lb6 = new JLabel("Renavam");
        lb7 = new JLabel("Chassis");
        lb8 = new JLabel("Valor da Locação Por Hora");
        lb9 = new JLabel("Valor Locação Por KM");
        lb10 = new JLabel("Situação");
        btnSalvar = new JButton("Salvar!");
        btnCancelar = new JButton("Cancelar!");
        btnCliente = new JButton("Cadastrar");
        btnmodelo = new JButton("Modelo");
        this.btnCliente.addActionListener(this.al);
        this.btnCliente.setActionCommand("cadastrar");
        
        this.add(lb1);
        this.add(txt1);
        
        this.add(lb2);
        this.add(txt2);
        
        this.add(lb3);
        this.add(txt3);
        
        this.add(lb4);
        this.add(txt4);
        
        this.add(lb5);
        this.add(txt5);
        
        this.add(lb6);
        this.add(txt6);
        
        this.add(lb7);
        this.add(txt7);
        
        this.add(lb8);
        this.add(txt8);
        
        this.add(lb9);
        this.add(txt9);
        
        this.add(lb10);
        this.add(txt10);
        
        this.btnSalvar.addActionListener(this.al);
        this.add(btnSalvar);
        this.add(btnCancelar);
        this.btnmodelo.addActionListener(this.al);
        this.btnmodelo.setActionCommand("modelo");
        this.add(btnmodelo);
        
    }
    public JDesktopPane getDesk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ModelAutomovel getModel(){   
        this.model.setPlaca(this.txt1.getText());          
        this.model.setCor(this.txt2.getText());
        this.model.setAno(this.txt3.getText());
        this.model.setTipoCombustivel(this.txt4.getText());
        this.model.setKmAtual(this.txt5.getText());
        this.model.setRenavam(this.txt6.getText());
        this.model.setChassi(this.txt7.getText());
        this.model.setValorLocacao_hora(this.txt8.getText());
        this.model.setValorLocacao_km(this.txt9.getText());
        this.model.setSituacao(this.txt10.getText());
        return model;
    }
    public void setModel(ModelAutomovel model) {
        this.model = model;
    }
}
