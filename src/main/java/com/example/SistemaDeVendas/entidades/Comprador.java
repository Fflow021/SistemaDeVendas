package com.example.SistemaDeVendas.entidades;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Comprador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComprador;
    private int celular;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "comprador", fetch = FetchType.EAGER)
    private List<Pedido> pedidoList = new ArrayList<>();

    public Comprador(Integer idComprador, int celular, String nome, String email) {
        this.idComprador = idComprador;
        this.celular = celular;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
}
