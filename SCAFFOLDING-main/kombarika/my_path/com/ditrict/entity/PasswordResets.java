package com.ditrict.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "password_resets")
public class PasswordResets {
	@Column(name = "created_at")
	TimeStamp createdAt;
	@Id
	@Column(name = "email")
	String email;
	@Column(name = "token")
	String token;


	public PasswordResets(){}
	public Timestamp getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Timestamp createdAt){
		this.createdAt = createdAt;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getToken(){
		return this.token;
	}
	public void setToken(String token){
		this.token = token;
	}

}
