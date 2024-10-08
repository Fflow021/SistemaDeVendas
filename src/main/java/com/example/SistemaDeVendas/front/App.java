package com.example.SistemaDeVendas.front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel FotoProdutoC;
    private JButton carrinhoDeComprasButton;
    private JLabel LabelDoMerchant;
    private JLabel wolffsoficial;
    private JLabel precinho;
    private JLabel produtoANome;

    public App() {
        carrinhoDeComprasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getMainScreen() {
        return MainScreen;
    }

    public void setProdutoALabel(String text) {
        this.produtoANome.setText(text);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        produtoANome = new JLabel();

        //instancio as label e as fotos(icons) pra poder por elas nos programas
        FotoProdutoA = new JLabel();
        ImageIcon icon = new ImageIcon("assets/BiscoitoDecorado.png");
        FotoProdutoA.setIcon(trataImagem(icon));

        FotoProdutoB = new JLabel();
        ImageIcon iconB = new ImageIcon("assets/PipocaGourmet.png");
        FotoProdutoB.setIcon(trataImagem(iconB));

        FotoProdutoC = new JLabel();
        ImageIcon iconC = new ImageIcon("assets/Brownie.png");
        FotoProdutoC.setIcon(trataImagem(iconC));

        //partezinha do merchant que eu sou esperto né ta ligado
        LabelDoMerchant = new JLabel();
        ImageIcon IconMerchant = new ImageIcon("assets/ETIQUETA 1 WOLFF'S-1.png");
        LabelDoMerchant = new JLabel(trataImagem(IconMerchant));
        Font myFont = new Font("Arial", Font.BOLD, 20);
        wolffsoficial = new JLabel();
        precinho = new JLabel();
        wolffsoficial.setFont(myFont);
        precinho.setFont(myFont);


    }

    private ImageIcon trataImagem(ImageIcon icon) { // Essa classe re escala a imagem, só usar um setSize do Swing cortava a imagem
        Image imgIconToImgOBJ = icon.getImage();
        Image imagemTratada = imgIconToImgOBJ.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        return new ImageIcon(imagemTratada);
    }
}
