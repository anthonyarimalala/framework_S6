package com.ditrict.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "personal_access_tokens")
public class PersonalAccessTokens {
	@Column(name = "abilities")
	String abilities;
	@Column(name = "last_used_at")
	TimeStamp lastUsedAt;
	@Column(name = "tokenable_type")
	String tokenableType;
	@Column(name = "tokenable_id")
	long tokenableId;
	@Column(name = "expires_at")
	TimeStamp expiresAt;
	@Column(name = "updated_at")
	TimeStamp updatedAt;
	@Column(name = "name")
	String name;
	@Column(name = "created_at")
	TimeStamp createdAt;
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "token")
	String token;


	public PersonalAccessTokens(){}
	public String getAbilities(){
		return this.abilities;
	}
	public void setAbilities(String abilities){
		this.abilities = abilities;
	}
	public Timestamp getLastUsedAt(){
		return this.lastUsedAt;
	}
	public void setLastUsedAt(Timestamp lastUsedAt){
		this.lastUsedAt = lastUsedAt;
	}
	public String getTokenableType(){
		return this.tokenableType;
	}
	public void setTokenableType(String tokenableType){
		this.tokenableType = tokenableType;
	}
	public Long getTokenableId(){
		return this.tokenableId;
	}
	public void setTokenableId(Long tokenableId){
		this.tokenableId = tokenableId;
	}
	public Timestamp getExpiresAt(){
		return this.expiresAt;
	}
	public void setExpiresAt(Timestamp expiresAt){
		this.expiresAt = expiresAt;
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
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getToken(){
		return this.token;
	}
	public void setToken(String token){
		this.token = token;
	}

}
