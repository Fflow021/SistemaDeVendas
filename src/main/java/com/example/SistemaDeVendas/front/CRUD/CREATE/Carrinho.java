package com.example.SistemaDeVendas.front.CRUD.CREATE;

import com.example.SistemaDeVendas.entidades.Comprador;
import com.example.SistemaDeVendas.entidades.Pagamento;
import com.example.SistemaDeVendas.entidades.Pedido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Carrinho {
    private JTextField nomeField;
    private JTextField celularField;
    private JTextField emailField;
    private JTextField textField4;
    private JComboBox pagamentoEscolha;
    private JLabel totalPedido;
    private JButton finalizarPedidoButton;
    private JPanel carrinhoTela;

    public JPanel getCarrinhoTela() {
        return carrinhoTela;
    }

    public Carrinho() {
        finalizarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de criar um pedido e um comprador
                Comprador comprador = new Comprador(1,
                        Integer.parseInt(celularField.getText()),
                        nomeField.getText(),
                        emailField.getText());
                System.out.println(comprador);
            }
        });
        pagamentoEscolha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pedido pedido = new Pedido();
                if(e.getSource()==pagamentoEscolha) {
                    new Pagamento(String.valueOf(pagamentoEscolha.getSelectedItem()),pedido);
                }
            }
        });
    }

    private void createUIComponents() {
        //TODO
        nomeField = new JTextField();
        celularField = new JTextField();
        emailField = new JTextField();
        finalizarPedidoButton = new JButton();

        String[] pagamentosTipos = {"Boleto","Cartão de Crédito", "PIX"};
        pagamentoEscolha = new JComboBox<>(pagamentosTipos);

    }

}
