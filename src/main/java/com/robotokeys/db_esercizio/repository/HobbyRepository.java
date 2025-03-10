package com.robotokeys.db_esercizio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robotokeys.db_esercizio.entity.Hobby;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long>{

}