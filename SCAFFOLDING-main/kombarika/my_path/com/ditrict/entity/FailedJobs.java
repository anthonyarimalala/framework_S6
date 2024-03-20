package com.ditrict.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "failed_jobs")
public class FailedJobs {
	@Column(name = "exception")
	String exception;
	@Column(name = "payload")
	String payload;
	@Column(name = "connection")
	String connection;
	@Id
	@Column(name = "id")
	long id;
	@Column(name = "failed_at")
	TimeStamp failedAt;
	@Column(name = "uuid")
	String uuid;
	@Column(name = "queue")
	String queue;


	public FailedJobs(){}
	public String getException(){
		return this.exception;
	}
	public void setException(String exception){
		this.exception = exception;
	}
	public String getPayload(){
		return this.payload;
	}
	public void setPayload(String payload){
		this.payload = payload;
	}
	public String getConnection(){
		return this.connection;
	}
	public void setConnection(String connection){
		this.connection = connection;
	}
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public Timestamp getFailedAt(){
		return this.failedAt;
	}
	public void setFailedAt(Timestamp failedAt){
		this.failedAt = failedAt;
	}
	public String getUuid(){
		return this.uuid;
	}
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getQueue(){
		return this.queue;
	}
	public void setQueue(String queue){
		this.queue = queue;
	}

}
