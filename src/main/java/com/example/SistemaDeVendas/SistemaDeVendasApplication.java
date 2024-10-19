package com.example.SistemaDeVendas;

import com.example.SistemaDeVendas.entidades.Produto;
import com.example.SistemaDeVendas.entidades.ProdutoPedido;
import com.example.SistemaDeVendas.front.CRUD.CREATE.App;
import com.example.SistemaDeVendas.front.CRUD.MainScreen;

import javax.swing.*;

public class SistemaDeVendasApplication {

	public static void main(String[] args) {
		// Configuracoes do Swing
		JFrame frame = new JFrame("MainScreen");
		App app = new App();
		MainScreen mainScreen = new MainScreen(app);
		frame.setContentPane(mainScreen.getMainScreen());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 600);
		frame.setVisible(true);


//		adiciona um produtoPedido dentro do set de ProdutoPedido
//		pedido.getProdutoPedidoSet().add(produtoPedido);
//


//		Produto produto1 = new Produto(2, 25, "Biscoito de Chocolate", "Chocolate", 25.0F);
//		Produto produto2 = new Produto(3, 30, "Biscoito de Morango", "Morango", 30.0F);
//		Produto produto3 = new Produto(4, 15, "Biscoito de Menta", "Menta", 15.0F);
//		ProdutoPedido produtoPedido1 = new ProdutoPedido(pedido, produto1, 20);
//		ProdutoPedido produtoPedido2 = new ProdutoPedido(pedido, produto2, 5);
//		ProdutoPedido produtoPedido3 = new ProdutoPedido(pedido, produto3, 3);
//		pedido.getProdutoPedidoSet().add(produtoPedido1);
//		pedido.getProdutoPedidoSet().add(produtoPedido2);
//		pedido.getProdutoPedidoSet().add(produtoPedido3);
//


		// instanciação dos objetos para salvar no banco de dados
//		Produto produtoBiscoito = new Produto(null, 20, "Biscoito Decorado", "Baunilha", 20.00F);
//		Produto produtoPipoca = new Produto(null, 20, "Pipoca Gourmet", "Pão de Alho", 9.00F);
//		Produto produtoBrownie = new Produto(null, 20, "Lascas de Brownies", "Chocolate", 15.00F);
//		System.out.println("\n");
//		System.out.println("total dos pedido com os produtos  'produto','produto1','produto2','produto3': " + pedido.getTotal());
	}

}
