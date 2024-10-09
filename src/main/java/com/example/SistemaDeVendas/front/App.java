package com.example.SistemaDeVendas.front;

import com.example.SistemaDeVendas.entidades.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel MainScreen;
    private JButton adicionarAoCarrinhoButton;
    private JButton adicionarAoCarrinhoBButton;
    private JButton adicionarAoCarrinhoCButton;
    private JLabel FotoProdutoA;
    private JLabel FotoProdutoB;
    private JLabel FotoProdutoC;
    private JButton carrinhoDeComprasButton;
    private JLabel labelDoMerchant;
    private JLabel wolffsoficial;
    private JLabel precinho;
    private JLabel produtoANome;
    private JLabel saborGet;
    private JLabel precoGet;
    private JLabel produtoBNome;
    private JLabel precoBGet;
    private JLabel saborBGet;
    private JLabel produtoCNome;
    private JLabel precoCGet;
    private JLabel saborCGet;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

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

    private void createUIComponents() {
        //modulozinho do primeiro produto
        produtoANome = new JLabel();

        FotoProdutoA = new JLabel();
        ImageIcon icon = new ImageIcon("assets/BiscoitoDecorado.png");
        FotoProdutoA.setIcon(trataImagem(icon));

        precoGet = new JLabel();
        saborGet = new JLabel();


        //modulozinho contendo objetos do segundo produto
        produtoBNome = new JLabel();

        FotoProdutoB = new JLabel();
        ImageIcon iconB = new ImageIcon("assets/PipocaGourmet.png");
        FotoProdutoB.setIcon(trataImagem(iconB));

        precoBGet = new JLabel();
        saborBGet = new JLabel();


        //modulozinho contendo objetos do terceiro produto
        produtoCNome = new JLabel();

        FotoProdutoC = new JLabel();
        ImageIcon iconC = new ImageIcon("assets/Brownie.png");
        FotoProdutoC.setIcon(trataImagem(iconC));

        precoCGet = new JLabel();
        saborCGet = new JLabel();


        //partezinha do merchant que eu sou esperto né ta ligado
        labelDoMerchant = new JLabel();
        ImageIcon IconMerchant = new ImageIcon("assets/ETIQUETA 1 WOLFF'S-1.png");
        labelDoMerchant = new JLabel(trataImagem(IconMerchant));
        Font myFont = new Font("Arial", Font.BOLD, 20);
        wolffsoficial = new JLabel();
        precinho = new JLabel();
        wolffsoficial.setFont(myFont);
        precinho.setFont(myFont);
    }

    public static ImageIcon trataImagem(ImageIcon icon) { // Essa classe re escala a imagem, só usar um setSize do Swing cortava a imagem
        Image imgIconToImgOBJ = icon.getImage();
        Image imagemTratada = imgIconToImgOBJ.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        return new ImageIcon(imagemTratada);
    }

    public void montaProdutoNaTela(Produto produto, App app) {
        app.produtoANome.setText(produto.getName());
        app.precoGet.setText(String.valueOf(produto.getPreco()));
        app.saborGet.setText(produto.getSabor());
    }
    public void montaProdutoNaTelaB(Produto produto, App app) {
        app.produtoBNome.setText(produto.getName());
        app.precoBGet.setText(String.valueOf(produto.getPreco()));
        app.saborBGet.setText(produto.getSabor());
    }
    public void montaProdutoNaTelaC(Produto produto, App app) {
        app.produtoCNome.setText(produto.getName());
        app.precoCGet.setText(String.valueOf(produto.getPreco()));
        app.saborCGet.setText(produto.getSabor());
    }
}
