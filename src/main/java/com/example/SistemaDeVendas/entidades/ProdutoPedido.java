package com.example.SistemaDeVendas.entidades;

import com.example.SistemaDeVendas.entidades.PK.ProdutoPedidoPK;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProdutoPedido {

    private ProdutoPedidoPK id = new ProdutoPedidoPK();
    private int quantidade;
    private float preco;

    public ProdutoPedido(Pedido pedido, Produto produto, int quantidade) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade=quantidade;
        this.preco=produto.getPreco();
    }
    public ProdutoPedido(Produto produto, int quantidade) {
        id.setProduto(produto);
        this.quantidade=quantidade;
        this.preco=produto.getPreco();
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
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

    public float getSubtotal(){
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "ProdutoPedido{"+
                "quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
