package com.example.SistemaDeVendas;


import com.example.SistemaDeVendas.entidades.*;
import com.example.SistemaDeVendas.front.CRUD.MainScreen;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

public class SistemaDeVendasApplication {

	public static void main(String[] args) {
		// Configuracoes do Swing
		JFrame frame = new JFrame("MainScreen");
		MainScreen mainScreen = new MainScreen();
		frame.setContentPane(mainScreen.getMainScreen());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 600);
		frame.setVisible(true);

		// instanciação dos objetos para salvar no banco de dados
		Produto produtoBiscoito = new Produto(null, 20, "Biscoito Decorado", "Baunilha", 20.00F);
		Produto produtoPipoca = new Produto(null, 20, "Pipoca Gourmet", "Pão de Alho", 9.00F);
		Produto produtoBrownie = new Produto(null, 20, "Lascas de Brownies", "Chocolate", 15.00F);

		// Configurações do Hibernate
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-vendas");
		EntityManager em = emf.createEntityManager();

		// Começa a transação com o banco de dados
		em.getTransaction().begin();

		// Persiste os dados no banco de dados
		em.persist(produtoBiscoito);
		em.persist(produtoPipoca);
		em.persist(produtoBrownie);

		// Finaliza a transação com o banco de dados
		em.getTransaction().commit();


		//instanciação de um produto teste
//		app.montaProdutoNaTela(produtoBiscoito,app);
//		app.montaProdutoNaTelaB(produtoPipoca,app);
//		app.montaProdutoNaTelaC(produtoBrownie,app);
//		Comprador cliente = new Comprador(1,988884444,"Rodrigo Samambaia", "rodrigosamba@gmail.com");
//		Pedido pedido = new Pedido(1, "Ninho da Gávea", cliente);
//		Pagamento pagamento = new Pagamento(1, "Cartão", pedido);
//		//atribui um tipo de pagamento para pedido
//		pedido.setPagamento(pagamento);
//		//ProdutoPedido produtoPedido = new ProdutoPedido(pedido, produtoBiscoito, 40, 20.0F);
//		//adiciona um produtoPedido dentro do set de ProdutoPedido
//		//pedido.getProdutoPedidoSet().add(produtoPedido);
//
//		System.out.println("\n");
//		System.out.println("\n");
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
//		System.out.println("\n");
//		System.out.println("total dos pedido com os produtos  'produto','produto1','produto2','produto3': " + pedido.getTotal());
	}

}
