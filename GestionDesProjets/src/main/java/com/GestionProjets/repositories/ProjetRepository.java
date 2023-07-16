package com.GestionProjets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
