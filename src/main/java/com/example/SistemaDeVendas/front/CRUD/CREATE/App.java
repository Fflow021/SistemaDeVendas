package com.example.SistemaDeVendas.front.CRUD.CREATE;

import com.example.SistemaDeVendas.DAO.DAO;
import com.example.SistemaDeVendas.DTO.ProdutoPedidoDTO;
import com.example.SistemaDeVendas.entidades.Produto;
import com.example.SistemaDeVendas.entidades.ProdutoPedido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

public class App {
    private JPanel MainScreen;
    private JButton adicionarAoCarrinhoButton;
    private JButton adicionarAoCarrinhoBButton;
    private JButton adicionarAoCarrinhoCButton;
    private JLabel fotoProdutoA;
    private JLabel fotoProdutoB;
    private JLabel fotoProdutoC;
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
    private JTextField quantidadeAField;
    private JTextField textField2;
    private JTextField textField3;

    public App() {

//        //produto mocado
//        Produto produtoBiscoito = new Produto(1, 20, "Biscoito Decorado", "Baunilha", 20.0F);
        carrinhoDeComprasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("carrinhoTela");
                Carrinho carrinho = new Carrinho();
                frame.setContentPane(carrinho.getCarrinhoTela());
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setSize(1500, 400);
                frame.setVisible(true);
            }
        });
        adicionarAoCarrinhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DAO daoBiscoito = new DAO<>(Produto.class);
                Produto produto = (Produto) daoBiscoito.selectNaDBbyID(1);
                ProdutoPedido produtoPedido = new ProdutoPedido(null, produto, Integer.parseInt(quantidadeAField.getText()));
                ProdutoPedidoDTO pdDTO = new ProdutoPedidoDTO(produtoPedido);

            }
        });
    }

    public JPanel getMainScreen() {
        return MainScreen;
    }

    private void createUIComponents() {
        //modulozinho do primeiro produto
        produtoANome = new JLabel();

        fotoProdutoA = new JLabel();
        ImageIcon icon = new ImageIcon("assets/BiscoitoDecorado.png");
        fotoProdutoA.setIcon(trataImagem(icon));

        quantidadeAField = new JTextField();
        precoGet = new JLabel();
        saborGet = new JLabel();


        //modulozinho contendo objetos do segundo produto
        produtoBNome = new JLabel();

        fotoProdutoB = new JLabel();
        ImageIcon iconB = new ImageIcon("assets/PipocaGourmet.png");
        fotoProdutoB.setIcon(trataImagem(iconB));

        precoBGet = new JLabel();
        saborBGet = new JLabel();


        //modulozinho contendo objetos do terceiro produto
        produtoCNome = new JLabel();

        fotoProdutoC = new JLabel();
        ImageIcon iconC = new ImageIcon("assets/Brownie.png");
        fotoProdutoC.setIcon(trataImagem(iconC));

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

    public static ImageIcon trataImagem(ImageIcon icon) { // Essa classe re-escala a imagem, só usar um setSize do Swing cortava a imagem
        Image imgIconToImgOBJ = icon.getImage();
        Image imagemTratada = imgIconToImgOBJ.getScaledInstance(150,150, Image.SCALE_SMOOTH);
        return new ImageIcon(imagemTratada);
    }

    public void montaProdutoNaTela(Produto produto, App app) {
        app.produtoANome.setText(produto.getNome());
        app.precoGet.setText(String.valueOf(produto.getPreco()));
        app.saborGet.setText(produto.getSabor());
    }
    public void montaProdutoNaTelaB(Produto produto, App app) {
        app.produtoBNome.setText(produto.getNome());
        app.precoBGet.setText(String.valueOf(produto.getPreco()));
        app.saborBGet.setText(produto.getSabor());
    }
    public void montaProdutoNaTelaC(Produto produto, App app) {
        app.produtoCNome.setText(produto.getNome());
        app.precoCGet.setText(String.valueOf(produto.getPreco()));
        app.saborCGet.setText(produto.getSabor());
    }
}
