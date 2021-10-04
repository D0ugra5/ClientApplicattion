package br.com.doug.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
public class Estado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;
}
