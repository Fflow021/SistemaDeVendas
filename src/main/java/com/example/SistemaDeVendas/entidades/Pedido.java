package com.example.SistemaDeVendas.entidades;


import lombok.NoArgsConstructor;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
public class Pedido {

    // ATRIBUTOS DE PEDIDO
    private int idPedido;
    private String localDeEntrega;
    private String horaPedido;
    //ATRIBUTOS RELACIONAMENTO
    private Comprador comprador;
    private Set<ProdutoPedido> produtoPedidoSet = new HashSet<>();
    private Pagamento pagamento;

    public Pedido(int idPedido, String localDeEntrega, Comprador comprador) {
        this.idPedido = idPedido;
        this.localDeEntrega = localDeEntrega;
        this.horaPedido = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.comprador = comprador;

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

    //GET E SET RELACIONAMENTO
    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Set<ProdutoPedido> getProdutoPedidoSet() {
        return produtoPedidoSet;
    }


    //por alguma razão ele não ta retornando o total
    public float getTotal(){
        float total = 0F;
        for (ProdutoPedido item : produtoPedidoSet){
            total += item.getSubtotal();
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
                ", produtosSet=" + produtoPedidoSet +
                ", pagamento=" + pagamento +
                '}';
    }
}
