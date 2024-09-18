package com.example.SistemaDeVendas.entidades;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Comprador {

    private int idComprador;
    private int celular;
    private String nome;
    private String email;
    private List<Pedido> pedidoList = new ArrayList<>();

    public Comprador(int idComprador, int celular, String nome, String email) {
        this.idComprador = idComprador;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "idComprador=" + idComprador +
                ", celular=" + celular +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", pedidoList=" + pedidoList +
                '}';
    }
}
