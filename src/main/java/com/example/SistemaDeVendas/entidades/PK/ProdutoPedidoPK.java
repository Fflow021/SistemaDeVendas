package com.example.SistemaDeVendas.entidades.PK;

import com.example.SistemaDeVendas.entidades.Pedido;
import com.example.SistemaDeVendas.entidades.Produto;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@NoArgsConstructor
@Embeddable
public class ProdutoPedidoPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "idPedido")
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
