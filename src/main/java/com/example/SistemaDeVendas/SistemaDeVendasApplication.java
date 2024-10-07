package com.example.SistemaDeVendas;


import com.example.SistemaDeVendas.Front.App;
import com.example.SistemaDeVendas.entidades.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

//@SpringBootApplication
public class SistemaDeVendasApplication {

	public static void main(String[] args) {
		// Configuracoes do Swing
		JFrame frame = new JFrame("App");
		frame.setContentPane(new App().getMainScreen());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);

		Produto produto = new Produto(1, 20, "Biscoito Decorado", "Baunilha", "Estrela", "Pequeno", 20.0F);
		Comprador cliente = new Comprador(1,988884444,"Rodrigo Samambaia", "rodrigosamba@gmail.com");
		Pedido pedido = new Pedido(1, "Ninho da Gávea", cliente);
		Pagamento pagamento = new Pagamento(1, "Cartão", pedido);
		//atribui um tipo de pagamento para pedido
		pedido.setPagamento(pagamento);
		ProdutoPedido produtoPedido = new ProdutoPedido(pedido, produto, 40, 20.0F);
		//adiciona um produtoPedido dentro do set de ProdutoPedido
		pedido.getProdutoPedidoSet().add(produtoPedido);

		System.out.println("\n\n");

		System.out.println(cliente);
		System.out.println("\n");
		System.out.println(pedido);
		System.out.println("\n");
		System.out.println(produto);
		System.out.println("\n");
		System.out.println(produtoPedido);
		System.out.println("\n");
		System.out.println(pagamento);
		System.out.println("\n");
		System.out.println("total: " + pedido.getTotal());
		System.out.println("subtotal: " + produtoPedido.getSubtotal());

		System.out.println("\n");

		Produto produto1 = new Produto(2, 25, "Biscoito de Chocolate", "Chocolate", "Quadrado", "Médio", 25.0F);
		Produto produto2 = new Produto(3, 30, "Biscoito de Morango", "Morango", "Coração", "Grande", 30.0F);
		Produto produto3 = new Produto(4, 15, "Biscoito de Menta", "Menta", "Redondo", "Pequeno", 15.0F);
		ProdutoPedido produtoPedido1 = new ProdutoPedido(pedido, produto1, 20, 25.0F);
		ProdutoPedido produtoPedido2 = new ProdutoPedido(pedido, produto2, 5, 30.0F);
		ProdutoPedido produtoPedido3 = new ProdutoPedido(pedido, produto3, 3, 15.0F);
		pedido.getProdutoPedidoSet().add(produtoPedido1);
		pedido.getProdutoPedidoSet().add(produtoPedido2);
		pedido.getProdutoPedidoSet().add(produtoPedido3);

		System.out.println("\n");
		System.out.println("total dos pedido com os produtos  'produto','produto1','produto2','produto3': " + pedido.getTotal());


	}
}
