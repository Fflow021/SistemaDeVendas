package com.example.SistemaDeVendas.entidades.PK;

import com.example.SistemaDeVendas.entidades.Pedido;
import com.example.SistemaDeVendas.entidades.Produto;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@Embeddable
public class ProdutoPedidoPK {

    private Produto produto;
    private Pedido pedido;

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
