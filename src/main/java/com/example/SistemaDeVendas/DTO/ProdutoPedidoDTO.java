package com.example.SistemaDeVendas.DTO;

import com.example.SistemaDeVendas.entidades.ProdutoPedido;

import java.io.Serializable;

public class ProdutoPedidoDTO implements Serializable {

    private ProdutoPedido produtoPedido;

    public ProdutoPedidoDTO(ProdutoPedido produtoPedido) {
        this.produtoPedido = produtoPedido;
    }

    public ProdutoPedido getProdutoPedido() {
        return produtoPedido;
    }
}
