package com.swirebev.codegen.generator.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.swirebev.codegen.model.ContentModel;
import com.swirebev.codegen.model.JavaModel;
import com.swirebev.codegen.util.ConfigurationHelper;
import com.swirebev.codegen.Constant;

import freemarker.template.Template;
import freemarker.template.TemplateException;

public abstract class GeneratorAbstract {

	public void generate(String templateFileName, Map<String, Object> data,	String fileName) {
		try {
			String templateFileDir = templateFileName.substring(0,templateFileName.lastIndexOf("/"));
			
			
			String templateFile = templateFileName.substring(templateFileName.lastIndexOf("/"),	templateFileName.length());
			// Get the templat object
			String genFileDir = fileName.substring(0, fileName.lastIndexOf("/"));
			Template template = ConfigurationHelper.getConfiguration(templateFileDir).getTemplate(templateFile);
			
			System.out.println(templateFileDir);
			System.out.println(templateFile);
			System.out.println(genFileDir);
			
			org.apache.commons.io.FileUtils.forceMkdir(new File(genFileDir));
			File output = new File(fileName);
			Writer writer = new FileWriter(output);
			template.process(data, writer);
			writer.close();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String package2path(String packageName) {
		return packageName.replace('.', '/');
	}

	protected String getFileName(String filePath) {
		String fileName = StringUtils.substringAfterLast(filePath, "/");
		if (fileName.equals("") || fileName == null) {
			fileName = StringUtils.substringAfterLast(filePath, "\\");
		}
		return fileName;
	}


	public Map<String, Object> genData(JavaModel javaModel) {
		ContentModel contentModel = new ContentModel();
		contentModel.setDate(new Date());
		contentModel.setAuthor(Constant.AUTHOR);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("model", javaModel);
		data.put("contentModel", contentModel);
		data.put("pList", this.getPList());
		return data;
	}

	public JavaModel genJavaModel(String fileName, String packageName) {
		JavaModel javaModel = new JavaModel();
		javaModel.setPackageName(packageName);
		String className = StringUtils.substringBefore(fileName, ".");
		javaModel.setClassName(className);
		if (className.contains(Constant.DAO)) {
			String beanName = className.substring(0,
					className.indexOf(Constant.DAO));
			javaModel.setBeanName(beanName);
		}
		if (className.contains(Constant.SERVICE)) {
			String beanName = className.substring(1,
					className.indexOf(Constant.SERVICE));
			javaModel.setBeanName(beanName);
		}
		if (className.contains(Constant.SERVICEImpl)) {
			String beanName = className.substring(0,
					className.indexOf(Constant.SERVICEImpl));
			javaModel.setBeanName(beanName);
		}
		if(className.contains(Constant.CONTROLLER)){
			String beanName = className.substring(0,
					className.indexOf(Constant.CONTROLLER));
			javaModel.setBeanName(beanName);
		}
		return javaModel;
	}

	public List getPList() {
		ArrayList pList = new ArrayList();
		if (Constant.CONTENT == null || Constant.CONTENT.length == 0) {
			return null;
		}
		for (int i = 0; i < Constant.CONTENT.length; i++) {
			ContentModel contentModel = new ContentModel();
			contentModel.setType(Constant.CONTENT[i][0]);
			contentModel.setProperties(Constant.CONTENT[i][1]);
			contentModel.setContent(Constant.CONTENT[i][2]);
			pList.add(contentModel);
		}
		return pList;
	}
}
