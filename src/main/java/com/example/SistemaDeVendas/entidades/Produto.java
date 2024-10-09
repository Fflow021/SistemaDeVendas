package com.example.SistemaDeVendas.entidades;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
public class Produto {

    private int idProduto;
    private int quantidade;
    private String name;
    private String sabor;
    private float preco;
    private Set<ProdutoPedido> pedidoList = new HashSet<>();

    public Produto(int idProduto, int quantidade, String name, String sabor, float preco) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.name = name;
        this.sabor = sabor;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    public Set<Pedido> getPedidos() {
        Set<Pedido> set = new HashSet<>();
        for(ProdutoPedido produtoPedido : pedidoList) {
            set.add(produtoPedido.getPedido());
        }
        return set;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", quantidade=" + quantidade +
                ", name='" + name + '\'' +
                ", sabor='" + sabor + '\'' +
                ", preco=" + preco +
                ", pedidoList=" + pedidoList +
                '}';
    }
}
