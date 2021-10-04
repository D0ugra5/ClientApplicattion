package br.com.doug.repositories;

import br.com.doug.domain.Categoria;
import org.springframework.stereotype.Repository;
import  org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
}
