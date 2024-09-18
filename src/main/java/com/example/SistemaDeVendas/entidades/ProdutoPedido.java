package com.example.SistemaDeVendas.entidades;

import com.example.SistemaDeVendas.entidades.PK.ProdutoPedidoPK;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ProdutoPedido {

    private ProdutoPedidoPK id = new ProdutoPedidoPK();
    private int quantidade;
    private float preco;

    public ProdutoPedido(Pedido pedido, Produto produto, int quantidade, float preco) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade=quantidade;
        this.preco=preco;
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

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public Pedido getPedido() {
        return id.getPedido();
    }

    public void setOrder(Pedido pedido) {
        id.setPedido(pedido);
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
