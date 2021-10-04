package br.com.doug.domain;

import br.com.doug.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class PagamentoComBoleto extends Pagamento {


    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataPagamento;


    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estado, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}
