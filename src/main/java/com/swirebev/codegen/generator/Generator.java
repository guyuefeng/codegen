package com.swirebev.codegen.generator;

/*
 * 接口
 */
public interface Generator {
	//生成Bean
	public void genBean(String fileName);
	
	//生成DAO
	public void genDAO(String fileName);
	
	//生成Service接口
	public void genService(String fileName);
	
	//生成Service实现
	public void genServiceImpl(String fileName);
	
	//生成Controller层
	public void genController(String fileName);
}
