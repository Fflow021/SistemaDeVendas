package com.example.SistemaDeVendas.entidades;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
public class Pagamento {

    private int idPagamento;
    private String tipo;
    private String horaPagamento;
    private Pedido pedido;

    public Pagamento(int idPagamento, String tipo, Pedido pedido) {
        this.idPagamento = idPagamento;
        this.tipo = tipo;
        this.horaPagamento = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.pedido = pedido;

    }
    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(String horaPagamento) {
        this.horaPagamento = horaPagamento;
    }



    @Override
    public String toString() {
        return "Pagamento{" +
                "idPagamento=" + idPagamento +
                ", tipo='" + tipo + '\'' +
                ", horaPagamento='" + horaPagamento + "'}";
    }
}
