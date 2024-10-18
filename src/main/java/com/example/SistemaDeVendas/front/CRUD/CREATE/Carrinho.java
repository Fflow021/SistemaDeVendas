package com.example.SistemaDeVendas.front.CRUD.CREATE;

import com.example.SistemaDeVendas.DAO.DAO;
import com.example.SistemaDeVendas.DTO.ProdutoPedidoDTO;
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
    private JTextField enderecoField;
    private JComboBox pagamentoEscolha;
    private JLabel totalPedido;
    private JButton finalizarPedidoButton;
    private JPanel carrinhoTela;
    private Pedido pedido;
    private Comprador comprador;
    private Pagamento pagamento;

    public JPanel getCarrinhoTela() {
        return carrinhoTela;
    }

    public Carrinho() {
        // DROPDOWN PARA ESCOLHER O MEIO DE PAGAMENTO
        pagamentoEscolha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                //Pedido pedido = new Pedido();
//                if(e.getSource()==pagamentoEscolha) {
//                    pagamento = new Pagamento(null,
//                            String.valueOf(pagamentoEscolha.getSelectedItem())
//                            ,pedido);
//                }
            }
        });
        // BOTÃO PARA FINALIZAR PEDIDO
        finalizarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de criar um comprador e persistir no db
                comprador = new Comprador(null,
                        Integer.parseInt(celularField.getText()),
                        nomeField.getText(),
                        emailField.getText());

                DAO daoDeComprador = new DAO<>(Comprador.class);
                daoDeComprador.persisteNoDB(comprador);

                // Lógica de criar um pedido e persistir no db
                pedido = new Pedido(null,
                        enderecoField.getText(),
                        comprador);

                // Lógica de criar um pagamento e persistir no db
                pagamento = new Pagamento(null,
                           String.valueOf(pagamentoEscolha.getSelectedItem())
                            ,pedido);

                pedido.setPagamento(pagamento);

                DAO daoDePedido = new DAO<>(Pedido.class);
                daoDePedido.persisteNoDB(pedido);
            }
        });

    }

    private void createUIComponents() {
        //TODO
        nomeField = new JTextField();
        celularField = new JTextField();
        emailField = new JTextField();
        enderecoField = new JTextField();
        finalizarPedidoButton = new JButton();

        String[] pagamentosTipos = {"Boleto","Cartão de Crédito", "PIX"};
        pagamentoEscolha = new JComboBox<>(pagamentosTipos);

    }

}
