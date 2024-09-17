package com.example.SistemaDeVendas;

import com.example.SistemaDeVendas.entidades.Comprador;
import com.example.SistemaDeVendas.entidades.Pagamento;
import com.example.SistemaDeVendas.entidades.Pedido;
import com.example.SistemaDeVendas.entidades.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaDeVendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeVendasApplication.class, args);

		Comprador cliente = new Comprador(1,988884444,"Rodrigo Samambaia", "rodrigosamba@gmail.com");
		Pedido pedido = new Pedido(1, "Ninho da Gávea");
		Pagamento pagamento = new Pagamento(1, "Cartão");
		Produto produto = new Produto(1, 20, "Biscoito Decorado", "Baunilha", "Estrela", "Pequeno", 20.0F);

		System.out.println("\n\n\n\n");

		System.out.println(cliente);
		System.out.println("\n");
		System.out.println(pedido);
		System.out.println("\n");
		System.out.println(pagamento);
		System.out.println("\n");
		System.out.println(produto);

	}
}
