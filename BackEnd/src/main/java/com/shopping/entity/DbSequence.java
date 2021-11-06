package com.shopping.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DbSequence {

	private String id;
	private int seq;

	public DbSequence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DbSequence(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

}
