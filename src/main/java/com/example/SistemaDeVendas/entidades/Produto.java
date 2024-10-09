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
    private String formato;
    private String tamanho;
    private float preco;
    private Set<ProdutoPedido> pedidoList = new HashSet<>();

    public Produto(int idProduto, int quantidade, String name, String sabor, String formato, String tamanho, float preco) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.name = name;
        this.sabor = sabor;
        this.formato = formato;
        this.tamanho = tamanho;
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
                ", formato='" + formato + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                ", pedidoList=" + pedidoList +
                '}';
    }
}
