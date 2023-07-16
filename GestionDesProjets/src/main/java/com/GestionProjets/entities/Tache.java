package com.GestionProjets.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Tache {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Column(nullable = false)
    private String titre;
    @Column
    private String description;
    @Column(nullable = false)
    private String dateDecheance;
    @Column(name="statut",  nullable= false)
    private List <String> statuts = new ArrayList<String>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "projet_id", nullable = true)
    private Projet projet;

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

	public String getDateDecheance() {
		return dateDecheance;
	}

	public void setDateDecheance(String dateDecheance) {
		this.dateDecheance = dateDecheance;
	}

	public List<String> getStatuts() {
		return statuts;
	}

	public void setStatuts(List<String> statuts) {
		this.statuts = statuts;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tache(long id, String titre, String description, String dateDecheance, List<String> statuts, Projet projet) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.dateDecheance = dateDecheance;
		this.statuts = statuts;
		this.projet = projet;
	}
    
    
    
}
