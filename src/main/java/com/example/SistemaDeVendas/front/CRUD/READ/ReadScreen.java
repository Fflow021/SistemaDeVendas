package com.example.SistemaDeVendas.front.CRUD.READ;

import com.example.SistemaDeVendas.DAO.DAO;
import com.example.SistemaDeVendas.entidades.Pedido;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ReadScreen {
    private JTable tablePedidos;
    private JPanel readScreen;
    private JTextField idField;
    private JButton buscarButton;
    private JScrollPane scrollPane;
    private JButton atualizarButton;

    public JPanel getReadScreen() {
        return readScreen;
    }

    public ReadScreen() {
        //TODO LOGICA DO BOTAO BUSCAR
        buscarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarTabela();
            }
        });
    }

    private void createUIComponents() {
        // Inicialização de widgets
        idField = new JTextField();

        String[] colunas = {
                "ID do Pedido", "Hora do Pedido", "Local de Entrega",
                "Total do Pedido", "Comprador", "Tipo de Pagamento"
        };

        DAO daoPedido = new DAO<>(Pedido.class);
        List<Pedido> pedidoList = daoPedido.getAllObjects();

        int numeroDeColunas = 6; // número magico mas fodasse não é como se coluna de pedidos fosse trocar de tamanho

        // lógica pra preencher a tabela, eu não sei como os método de
        // .addRow e .addColumns não funcionam e esse trabuco veio a existência
        Object[][] dados = new Object[pedidoList.size()][numeroDeColunas];
        for (int i = 0; i < pedidoList.size(); i++) {
            Pedido pedido = pedidoList.get(i);
            dados[i][0] = pedido.getIdPedido();
            dados[i][1] = pedido.getHoraPedido();
            dados[i][2] = pedido.getLocalDeEntrega();
            dados[i][3] = pedido.getTotalPedido();
            dados[i][4] = pedido.getComprador();
            dados[i][5] = pedido.getPagamento();
        }

        // Criando o modelo da tabela
        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        tablePedidos = new JTable(model);
        // por alguma razão os headers da tabela não aparecem se tu não faz isso
        scrollPane = new JScrollPane(tablePedidos);
    }

    private void atualizarTabela(){
        String[] colunas = {
                "ID do Pedido", "Hora do Pedido", "Local de Entrega",
                "Total do Pedido", "Comprador", "Tipo de Pagamento"
        };

        DAO daoPedido = new DAO<>(Pedido.class);
        List<Pedido> pedidoList = daoPedido.getAllObjects();

        Object[][] dados = new Object[pedidoList.size()][colunas.length];

        for (int i = 0; i < pedidoList.size(); i++) {
            Pedido pedido = pedidoList.get(i);
            dados[i][0] = pedido.getIdPedido();
            dados[i][1] = pedido.getHoraPedido();
            dados[i][2] = pedido.getLocalDeEntrega();
            dados[i][3] = pedido.getTotalPedido();
            dados[i][4] = pedido.getComprador();
            dados[i][5] = pedido.getPagamento();
        }

        // sim aqui a gente cria outro model e joga por cima do anterior
        DefaultTableModel model = new DefaultTableModel(dados, colunas);
        tablePedidos.setModel(model);
    }
}
