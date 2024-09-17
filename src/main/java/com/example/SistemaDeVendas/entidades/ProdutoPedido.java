package com.example.SistemaDeVendas.entidades;

import com.example.SistemaDeVendas.entidades.PK.ProdutoPedidoPK;

public class ProdutoPedido {

    private ProdutoPedidoPK produtoPedidoPK;

    public ProdutoPedido(ProdutoPedidoPK produtoPedidoPK) {
        this.produtoPedidoPK = produtoPedidoPK;
    }

    public ProdutoPedidoPK getProdutoPedidoPK() {
        return produtoPedidoPK;
    }

    public void setProdutoPedidoPK(ProdutoPedidoPK produtoPedidoPK) {
        this.produtoPedidoPK = produtoPedidoPK;
    }
}
