package com.GestionProjets.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Projet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String titre;
	@Column
	private String description;
	@Column
	private String DateDebut;
	@ManyToMany(mappedBy = "projets")
	private List <Collaborateur> collaborateurs = new ArrayList<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateDebut() {
		return DateDebut;
	}
	public void setDateDebut(String dateDebut) {
		DateDebut = dateDebut;
	}
	public List<Collaborateur> getCollaborateurs() {
		return collaborateurs;
	}
	public void setCollaborateurs(List<Collaborateur> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(long id, String titre, String description, String dateDebut, List<Collaborateur> collaborateurs) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		DateDebut = dateDebut;
		this.collaborateurs = collaborateurs;
	}

	
}
