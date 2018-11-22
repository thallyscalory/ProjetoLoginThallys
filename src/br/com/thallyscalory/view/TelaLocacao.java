/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.view;

import br.com.thallyscalory.model.ModelLocacao;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class TelaLocacao extends JInternalFrame {

    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10,lbv;
    JButton btnSalvar, btnCancelar, btnCliente,btnmodelo;
    JComboBox cbxcliente;
    ModelLocacao model;
    ActionListener al;

    public TelaLocacao(ActionListener al) {
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
        lb1 = new JLabel("Hora Inicio");
        lb2 = new JLabel("Hora Fim");
        lb3 = new JLabel("Km Inicio");
        lb4 = new JLabel("Km Fim");
        lb5 = new JLabel("Km Rodado");
        lb6 = new JLabel("Tempo");
        lb7 = new JLabel("Valor Hora");
        lb8 = new JLabel("Valor KM");
        lb9 = new JLabel("Valor Total");
        lb10 = new JLabel("Situação");
        btnSalvar = new JButton("Salvar!");
        btnCancelar = new JButton("Cancelar!");
        btnCliente = new JButton("Cadastrar");
        btnmodelo = new JButton("Automóvel");
        cbxcliente = new JComboBox();
        setClosable(true);
        setResizable(true);
        this.add(cbxcliente);
        this.btnCliente.addActionListener(this.al);
        this.btnCliente.setActionCommand("cadastrar");
        this.cbxcliente.addActionListener(this.al);
        this.add(btnCliente);
        
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
        this.btnmodelo.setActionCommand("automovel");
        this.add(btnmodelo);
        
    }
    public JDesktopPane getDesk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ModelLocacao getModel(){   
        this.model.setHorainicio(this.txt1.getText());          
        this.model.setHorafim(this.txt2.getText());
        this.model.setKmInicio(this.txt3.getText());
        this.model.setKmFim(this.txt4.getText());
        this.model.setKmRodado(this.txt5.getText());
        this.model.setTempoHoras(this.txt6.getText());
        this.model.setVlHora(this.txt7.getText());
        this.model.setVlKm(this.txt8.getText());
        this.model.setValorTotal(this.txt9.getText());
        this.model.setSituacao(this.txt10.getText());
        return model;
    }
    public void setModel(ModelLocacao model) {
        this.model = model;
    }
}
