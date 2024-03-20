package com.ditrict.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "migrations")
public class Migrations {
	@Column(name = "migration")
	String migration;
	@Column(name = "batch")
	Integer batch;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	Integer id;


	public Migrations(){}
	public String getMigration(){
		return this.migration;
	}
	public void setMigration(String migration){
		this.migration = migration;
	}
	public Integer getBatch(){
		return this.batch;
	}
	public void setBatch(Integer batch){
		this.batch = batch;
	}
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}

}
