package br.com.doug.services;

import br.com.doug.domain.Categoria;
import br.com.doug.domain.Cliente;
import br.com.doug.repositories.CategoriaRepository;
import br.com.doug.repositories.ClienteRepository;
import br.com.doug.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(int id){
        Optional<Cliente> cliente = repo.findById(id);



        return cliente.orElseThrow(()-> new ObjectNotFoundException("NOT FOUND"));
    }
}
