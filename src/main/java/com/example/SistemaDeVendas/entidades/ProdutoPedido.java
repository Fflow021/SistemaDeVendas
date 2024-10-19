package com.example.SistemaDeVendas.entidades;

import com.example.SistemaDeVendas.entidades.PK.ProdutoPedidoPK;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@NoArgsConstructor
@Entity
@Setter
@Getter
public class ProdutoPedido implements Serializable {

    @EmbeddedId
    private ProdutoPedidoPK id = new ProdutoPedidoPK();
    private int quantidade;
    private float preco;

    public ProdutoPedido(Pedido pedido, Produto produto, int quantidade) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade=quantidade;
        this.preco=produto.getPreco();
    }

    // Regra de negócio para pegar subTotal de subPedidos
    public float getSubtotal(){
        return preco * quantidade;
    }

    public Pedido getPedido() {
        return id.getPedido();
    }

    public Produto getProduto() {
        return id.getProduto();
    }

    public void setProduto(Produto produto) {
        id.setProduto(produto);
    }

    @Override
    public String toString() {
        return "ProdutoPedido{"+
                "quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
