package com.GestionProjets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Tache;

public interface TacheRepository extends JpaRepository<Tache, Long> {

}
