package br.com.doug.domain;

import br.com.doug.domain.enums.TipoCliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Cliente implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String email;

    private String cpfOuCnpj;

    private Integer tipo;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    @OneToMany(mappedBy ="cliente")
    private List<Endereco> endereco;

    @ElementCollection
    @CollectionTable(name = "TELEFONE")
    private Set<String> telefones;

    public Cliente(String nome, String email, String cpfOuCnpj, TipoCliente tipo) {
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
    }
    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

}
