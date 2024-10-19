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
    private String nome;
    private String sabor;
    private float preco;
    @OneToMany(mappedBy = "id.produto")
    private Set<ProdutoPedido> pedidoList = new HashSet<>();

    public Produto(Integer idProduto, int quantidade, String nome, String sabor, float preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.sabor = sabor;
        this.preco = preco;
    }

    public Produto(Produto produto) {
        this.idProduto = produto.getIdProduto();
        this.nome = produto.getNome();
        this.sabor = produto.sabor;
        this.preco = produto.getPreco();
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
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
                ", nome='" + nome + '\'' +
                ", sabor='" + sabor + '\'' +
                ", preco=" + preco;
    }
}
