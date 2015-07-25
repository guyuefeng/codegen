package com.swirebev.codegen.generator.impl;

import com.swirebev.codegen.generator.Generator;
import com.swirebev.codegen.Constant;

public class GeneratorImpl extends GeneratorAbstract implements Generator {

	@Override
	public void genBean(String fileName) {
		String filePath = new String("src/" + package2path(Constant.PACKAGE)
				+ "/" + fileName);
		super.generate(Constant.BEAN_TEMPLATE,
				super.genData(super.genJavaModel(fileName, Constant.PACKAGE)),
				filePath);
	}

	@Override
	public void genDAO(String fileName) {
		String filePath = new String("src/"	+ package2path(Constant.DAO_PACKAGE) + "/" + fileName);
		
		super.generate(Constant.DAO_TEMPLATE, super.genData(super.genJavaModel(fileName, Constant.DAO_PACKAGE)), filePath);
	}

	@Override
	public void genService(String fileName) {
		String filePath = new String("src/"	+ package2path(Constant.SERVICE_PACKAGE) + "/" + fileName);
		super.generate(Constant.SERVICE_TEMPLATE, super.genData(super.genJavaModel(fileName, Constant.SERVICE_PACKAGE)), filePath);
	}

	@Override
	public void genServiceImpl(String fileName) {
		String filePath = new String("src/" + package2path(Constant.SERVICE_IMPL_PACKAGE) + "/" + fileName);
		super.generate(Constant.SERVICE_IMPL_TEMPLATE, super.genData(super.genJavaModel(fileName, Constant.SERVICE_IMPL_PACKAGE)),
				filePath);

	}
	
	@Override
	public void genController(String fileName) {
		String filePath = new String("src/" + package2path(Constant.CONTROLLER_PACKAGE) + "/" + fileName);
		super.generate(Constant.CONTROLLER_TEMPLATE, super.genData(super.genJavaModel(fileName, Constant.CONTROLLER_PACKAGE)),
				filePath);

	}
}
