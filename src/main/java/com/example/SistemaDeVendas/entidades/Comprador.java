package com.example.SistemaDeVendas.entidades;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Entity
public class Comprador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComprador;
    private int celular;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "comprador")
    private List<Pedido> pedidoList = new ArrayList<>();

    public Comprador(Integer idComprador, int celular, String nome, String email) {
        this.idComprador = idComprador;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Integer idComprador) {
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
