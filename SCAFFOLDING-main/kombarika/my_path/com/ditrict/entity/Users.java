package com.ditrict.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class Users {
	@Column(name = "password")
	String password;
	@Column(name = "updated_at")
	TimeStamp updatedAt;
	@Column(name = "name")
	String name;
	@Column(name = "created_at")
	TimeStamp createdAt;
	@Column(name = "email_verified_at")
	TimeStamp emailVerifiedAt;
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "remember_token")
	String rememberToken;
	@Column(name = "email")
	String email;


	public Users(){}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public Timestamp getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt){
		this.updatedAt = updatedAt;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Timestamp getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Timestamp createdAt){
		this.createdAt = createdAt;
	}
	public Timestamp getEmailVerifiedAt(){
		return this.emailVerifiedAt;
	}
	public void setEmailVerifiedAt(Timestamp emailVerifiedAt){
		this.emailVerifiedAt = emailVerifiedAt;
	}
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getRememberToken(){
		return this.rememberToken;
	}
	public void setRememberToken(String rememberToken){
		this.rememberToken = rememberToken;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

}
