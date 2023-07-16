package com.GestionProjets.entities;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;

@Entity

public class Collaborateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Email
	@Column(unique= true)
	private String email;
	@Column(nullable = false)
	 private String mdp;
	@Column(name="role",  nullable= false)
    private List <String> roles = new ArrayList<String>();
	@ManyToMany
	@JoinTable(name="projet_collaborateur", joinColumns = @JoinColumn(name="collaborateur_id"), inverseJoinColumns = @JoinColumn(name="projet_id"))
	private List<Projet> projets = new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
	
	public Collaborateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Collaborateur(Long id, String nom, String prenom, @Email String email, String mdp, List<String> roles,
			List<Projet> projets) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.roles = roles;
		this.projets = projets;
	}
	

}
