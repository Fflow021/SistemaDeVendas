package com.example.SistemaDeVendas.entidades;



import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
public class Pedido implements Serializable {

    // ATRIBUTOS DE PEDIDO
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;
    private String localDeEntrega;
    private String horaPedido;
    //ATRIBUTOS RELACIONAMENTO
    @ManyToOne
    @JoinColumn
    private Comprador comprador;
    @OneToMany(mappedBy = "id.pedido", fetch = FetchType.EAGER)
    private Set<ProdutoPedido> produtoPedidoSet = new HashSet<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Pagamento pagamento;
    private float totalPedido;

    public Pedido(Integer idPedido, String localDeEntrega, Comprador comprador) {
        this.idPedido = idPedido;
        this.localDeEntrega = localDeEntrega;
        this.horaPedido = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        this.comprador = comprador;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getLocalDeEntrega() {
        return localDeEntrega;
    }

    public void setLocalDeEntrega(String localDeEntrega) {
        this.localDeEntrega = localDeEntrega;
    }

    public float getTotalPedido() {
        return totalPedido;
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

    // método pra adicionar um produto, pra não ter que dar setTotal.add(getTotal())
    public void adicionarProduto(ProdutoPedido produtoPedido) {
        produtoPedidoSet.add(produtoPedido);
        atualizarTotal();
    }
    // Atualizando o total internamente para não deixar um setTotal PUBLICO
    private void atualizarTotal() {
        totalPedido = 0F;
        for (ProdutoPedido item : produtoPedidoSet) {
            totalPedido += item.getSubtotal();
        }
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
                ", pagamento=" + pagamento +
                '}';
    }
}
