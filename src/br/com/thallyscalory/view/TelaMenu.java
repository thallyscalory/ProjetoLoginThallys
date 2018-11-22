/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory.view;

import br.com.thallyscalory.controler.ControlerMenu;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class TelaMenu extends JFrame{
    
    private JMenuItem menuItemCliente,menuItemAutomovel,menuItemLocacao,menuItemMarca,menuItemModelo;
    private JPanel painelInf;
    private JDesktopPane desktop;

    public TelaMenu() throws HeadlessException {
        super("Menu");
        init();
        showMe();
        
    }

    private void init() {
        this.setLayout(new BorderLayout());
        
        JMenuBar menuBar = new JMenuBar();
        this.add(menuBar,BorderLayout.NORTH);
        JMenu menu = new JMenu("Cadastro");
        menuBar.add(menu);
        menuItemCliente = new JMenuItem("Cliente");
        menuItemCliente.setActionCommand("menuItemCliente");
        menu.add(menuItemCliente);
        menuItemLocacao = new JMenuItem("Locação");
        menuItemLocacao.setActionCommand("menuItemLocacao");
        menu.add(menuItemLocacao);
        menuItemAutomovel = new JMenuItem("Automovel");
        menuItemAutomovel.setActionCommand("menuItemAutomovel");
        menu.add(menuItemAutomovel);
        menuItemMarca = new JMenuItem("Marca");
        menuItemMarca.setActionCommand("menuItemMarca");
        menu.add(menuItemMarca);
        menuItemModelo = new JMenuItem("Modelo");
        menuItemModelo.setActionCommand("menuItemModelo");
        menu.add(menuItemModelo);
        
        desktop = new JDesktopPane();
        this.add(desktop,BorderLayout.CENTER);
        
        painelInf = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.add(painelInf,BorderLayout.SOUTH);
        
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public JPanel getPainelInf() {
        return painelInf;
    }

    private void showMe() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void addControllerActionListener(ControlerMenu al) {
        menuItemCliente.addActionListener(al);
        menuItemLocacao.addActionListener(al);
        menuItemAutomovel.addActionListener(al);
        menuItemMarca.addActionListener(al);
        menuItemModelo.addActionListener(al);
    }

    public void getPainelInf(JLabel jLabel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
