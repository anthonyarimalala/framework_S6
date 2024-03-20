package com.ditrict.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "etudiants")
public class Etudiants {
	@Column(name = "updated_at")
	TimeStamp updatedAt;
	@Column(name = "created_at")
	TimeStamp createdAt;
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "nom")
	String nom;
	@Column(name = "prenom")
	String prenom;
	@Column(name = "email")
	String email;


	public Etudiants(){}
	public Timestamp getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt){
		this.updatedAt = updatedAt;
	}
	public Timestamp getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Timestamp createdAt){
		this.createdAt = createdAt;
	}
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

}
