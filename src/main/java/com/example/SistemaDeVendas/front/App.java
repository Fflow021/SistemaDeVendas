package com.example.SistemaDeVendas.front;

import javax.swing.*;
import java.awt.*;

public class App {
    private JTextPane ProdutoA;
    private JPanel MainScreen;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JButton adicionarAoCarrinhoButton;
    private JTextField textField2;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JButton adicionarAoCarrinhoBButton;
    private JTextField textField3;
    private JComboBox comboBox7;
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JButton adicionarAoCarrinhoCButton;
    private JLabel FotoProdutoA;
    private JLabel FotoProdutoB;

    public JTextPane getProdutoA() {
        return ProdutoA;
    }

    public JPanel getMainScreen() {
        return MainScreen;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        FotoProdutoA = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\phill\\Documents\\hell\\SistemaDeVendas\\assets\\BiscoitoDecorado.png");
        Image imgIconToImgOBJ = icon.getImage();
        Image imagemTratada = imgIconToImgOBJ.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        FotoProdutoA.setIcon(new ImageIcon(imagemTratada));


    }
}
