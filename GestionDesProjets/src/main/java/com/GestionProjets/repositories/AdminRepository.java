package com.GestionProjets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByEmailAndMdp(String email, String Mdp);
}
