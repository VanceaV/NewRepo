package com.smoothstack.entity;




public class Book {

	private long id;


	private String title;

	
	private long authorId;


	private long publisherId;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public long getAuthorId() {
		return authorId;
	}


	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}


	public long getPublisherId() {
		return publisherId;
	}


	public void setPublisherId(long publisherId) {
		this.publisherId = publisherId;
	}


}