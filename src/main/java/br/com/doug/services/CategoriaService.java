package br.com.doug.services;

import br.com.doug.domain.Categoria;
import br.com.doug.repositories.CategoriaRepository;
import br.com.doug.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(int id){
        Optional<Categoria> categoria = repo.findById(id);



        return categoria.orElseThrow(()-> new ObjectNotFoundException("NOT FOUND"));
    }
}
