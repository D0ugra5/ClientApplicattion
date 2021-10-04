package br.com.doug.repositories;

import br.com.doug.domain.Categoria;
import br.com.doug.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer>{
}
