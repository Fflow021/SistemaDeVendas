package com.example.SistemaDeVendas;

import com.example.SistemaDeVendas.entidades.Produto;
import com.example.SistemaDeVendas.entidades.ProdutoPedido;
import com.example.SistemaDeVendas.front.CRUD.CREATE.App;
import com.example.SistemaDeVendas.front.CRUD.MainScreen;
import com.example.SistemaDeVendas.front.CRUD.READ.ReadScreen;

import javax.swing.*;

public class SistemaDeVendasApplication {

	public static void main(String[] args) {
		// Configuracoes do Swing
		JFrame frame = new JFrame("MainScreen");

		App app = new App();
		ReadScreen readScreen = new ReadScreen();

		MainScreen mainScreen = new MainScreen(app, readScreen);

		frame.setContentPane(mainScreen.getMainScreen());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 600);
		frame.setVisible(true);

	}

}
