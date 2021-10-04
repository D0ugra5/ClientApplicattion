package br.com.doug.repositories;

import br.com.doug.domain.Pagamento;
import br.com.doug.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer>{
}
