package com.swirebev.codegen.model;

import java.util.Date;


public class ContentModel {
	
	private Date date;//创建日期
	private String author;//作者
	private String type;//类型
	private String properties;//属性
	private String content;//注释

	
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
