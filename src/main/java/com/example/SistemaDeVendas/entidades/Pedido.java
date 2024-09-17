package com.example.SistemaDeVendas.entidades;


import lombok.NoArgsConstructor;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

@NoArgsConstructor
public class Pedido {

    private int idPedido;
    private String localDeEntrega;
    private String horaPedido;
    private Comprador comprador;
    private Set<Produto> produtosSet;
    private Pagamento pagamento;

    public Pedido(int idPedido, String localDeEntrega) {
        this.idPedido = idPedido;
        this.localDeEntrega = localDeEntrega;
        this.horaPedido = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getLocalDeEntrega() {
        return localDeEntrega;
    }

    public void setLocalDeEntrega(String localDeEntrega) {
        this.localDeEntrega = localDeEntrega;
    }

    public String getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(String horaPedido) {
        this.horaPedido = horaPedido;
    }

    public float totalPedido(){
        float total = 0F;
        for (Produto produtoDaIteração : produtosSet){
            total = total + produtoDaIteração.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", localDeEntrega='" + localDeEntrega + '\'' +
                ", horaPedido=" + horaPedido +
                ", comprador=" + comprador +
                ", produtosSet=" + produtosSet +
                ", pagamento=" + pagamento +
                '}';
    }
}
