package com.example.SistemaDeVendas.entidades;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@Entity
@Getter
@Setter
public class Pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPagamento;
    private String tipo;
    private String horaPagamento;
    @OneToOne
    private Pedido pedido;

    public Pagamento(Integer idPagamento, String tipo, Pedido pedido) {
        this.idPagamento = idPagamento;
        this.tipo = tipo;
        this.horaPagamento = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return tipo;
    }
}
