package com.GestionProjets.repositories;


import com.GestionProjets.entities.Collaborateur;

public interface CollaborateurRepository {
	Collaborateur findByEmailAndMdp(String email, String Mdp);
}
