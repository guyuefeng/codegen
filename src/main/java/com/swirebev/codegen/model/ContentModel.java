package com.swirebev.codegen.model;

import java.util.Date;


public class ContentModel {
	
	private Date date;//��������
	private String author;//����
	private String type;//����
	private String properties;//����
	private String content;//ע��

	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}




}
