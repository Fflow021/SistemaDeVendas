package com.example.SistemaDeVendas.entidades.PK;

import com.example.SistemaDeVendas.entidades.Pedido;
import com.example.SistemaDeVendas.entidades.Produto;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProdutoPedidoPK {

    private Produto produto;
    private Pedido pedido;

    public ProdutoPedidoPK(Produto produto, Pedido pedido) {
        this.produto = produto;
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
