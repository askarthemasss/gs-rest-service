package com.askar.restservice;

/*
 * To model the greeting representation, create a resource representation class.
 * To do so, provide a plain old Java object(POJO) with fields, constructors,
 * and accessors for the id and content data,
 * 
 * This application uses the Jackson JSON library to automatically marshal instances
 * of type Greeting into JSON. Jackson is included by default by the web starter.
 * 
 */


public class Greeting {
	private final String content;
	private final long id;
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}

}
