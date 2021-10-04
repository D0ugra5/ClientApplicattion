package br.com.doug.services;

import br.com.doug.domain.Cliente;
import br.com.doug.domain.Pedido;
import br.com.doug.repositories.ClienteRepository;
import br.com.doug.repositories.PedidoRepository;
import br.com.doug.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(int id){
        Optional<Pedido> pedido = repo.findById(id);
        return pedido.orElseThrow(()-> new ObjectNotFoundException("NOT FOUND"));
    }
}
