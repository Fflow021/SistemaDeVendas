package com.example.SistemaDeVendas.entidades;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduto;
    private int quantidade;
    private String nome;
    private String sabor;
    private float preco;
    @OneToMany(mappedBy = "id.produto")
    private Set<ProdutoPedido> pedidoList = new HashSet<>();

    public Produto(Integer idProduto, int quantidade, String nome, String sabor, float preco) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.nome = nome;
        this.sabor = sabor;
        this.preco = preco;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
                ", nome='" + nome + '\'' +
                ", sabor='" + sabor + '\'' +
                ", preco=" + preco;
    }
}
