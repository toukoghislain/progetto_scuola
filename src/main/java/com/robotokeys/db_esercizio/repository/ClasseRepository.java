package com.robotokeys.db_esercizio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robotokeys.db_esercizio.entity.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long>{

}