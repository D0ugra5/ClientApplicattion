package br.com.doug.repositories;

import br.com.doug.domain.CategoriaDomain;
import org.springframework.stereotype.Repository;
import  org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaDomain,Integer>{
}
