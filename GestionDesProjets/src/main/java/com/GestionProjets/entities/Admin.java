package com.GestionProjets.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Admin {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 @Column(nullable= false)
 private String nom, prenom;
 @Email
 @Column(unique= true)
 private String email;
 @Column(nullable = false)
 private String mdp;
 
 public long getId() {
	return id;
}

public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public void setId(long id) {
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
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(long id, String nom, String prenom, @Email String email, String mdp) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.mdp = mdp;
}

 
 
}
