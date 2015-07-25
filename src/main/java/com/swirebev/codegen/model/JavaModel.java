package com.swirebev.codegen.model;

import java.util.List;

public class JavaModel {
	
	private String packageName;
	
	private String className;
	
	private String implementsName;
	
	private List<String> inputpackageList;
	//DAO层和Service层所需用到的javaBean
	private String beanName;

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<String> getInputpackageList() {
		return inputpackageList;
	}

	public void setInputpackageList(List<String> inputpackageList) {
		this.inputpackageList = inputpackageList;
	}

	public String getImplementsName() {
		return implementsName;
	}

	public void setImplementsName(String implementsName) {
		this.implementsName = implementsName;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
}
