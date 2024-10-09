package com.example.SistemaDeVendas.front.CRUD;


import com.example.SistemaDeVendas.front.App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.example.SistemaDeVendas.front.App.trataImagem;

public class MainScreen {
    private JPanel mainScreen;
    private JButton fazerUmPedidoButton;
    private JButton verUmPedidoButton;
    private JButton trocarPagamentoDeUmButton;
    private JButton cancelarUmPedidoButton;
    private JLabel labelLogoWolffsOficial;
    private JLabel primeiroTexto;
    private JLabel instagramLabel;
    private JLabel segueLaLabel;

    public JPanel getMainScreen() {
        return mainScreen;
    }

    public MainScreen() {
        fazerUmPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("App");
                App app = new App();
                frame.setContentPane(app.getMainScreen());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1500, 400);
                frame.setVisible(true);
            }
        });
    }

    private void createUIComponents() {
        // Texto de inicio
        primeiroTexto = new JLabel();
        primeiroTexto.setFont(new Font("Arial", Font.BOLD, 26));

        // Fotinho da tela
        labelLogoWolffsOficial = new JLabel();
        ImageIcon IconMerchant = new ImageIcon("assets/ETIQUETA 1 WOLFF'S-1.png");
        labelLogoWolffsOficial = new JLabel(trataImagem(IconMerchant));

        //insta
        instagramLabel = new JLabel();
        instagramLabel.setFont(new Font("Arial", Font.BOLD, 35));

        //seguelá
        segueLaLabel = new JLabel();
        segueLaLabel.setFont(new Font("Arial", Font.BOLD, 26));
    }
}
