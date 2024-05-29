package com.example.bootcamp;

public class Post {
	int userId;
	int id;
	String tittle;
	String body;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Post(int userId, int id, String tittle, String body) {
		super();
		this.userId = userId;
		this.id = id;
		this.tittle = tittle;
		this.body = body;
	}
	

}
