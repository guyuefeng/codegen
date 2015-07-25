package com.swirebev.codegen;

import com.swirebev.codegen.generator.Generator;
import com.swirebev.codegen.generator.impl.GeneratorImpl;

import junit.framework.TestCase;

public class TestMain extends TestCase {
	Generator generator;

	public void setUp() {
		generator = new GeneratorImpl();
	}

	public void testGenBean() {
		generator.genBean("CRMDictionary.java");
	}

	public void testGenDAO() {
		generator.genDAO("CRMDictionaryDAO.java");
	}

	public void testGenService() {
		generator.genService("ICRMDictionaryService.java");
	}

	public void testGenServiceImpl() {
		generator.genServiceImpl("CRMDictionaryServiceImpl.java");
	}
	
	public void testGenController() {
		generator.genController("CRMDictionaryController.java");
	}
}
