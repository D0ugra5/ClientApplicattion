package br.com.doug.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class ItemPedido implements Serializable {

    @EmbeddedId
    @JsonIgnore
    private ItemPedidoPk id;

    private Double desconto;
    private int quantidade;
    private Double preco;

    public ItemPedido(Pedido pedido,Produto produto, Double desconto, Integer quantidade, Double preco) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public Pedido getPedido(){
        return id.getPedido();
    }


    public Produto getProduto(){
        return id.getProduto();
    }

}
