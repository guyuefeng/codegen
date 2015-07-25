package com.swirebev.codegen;

//配置常量
public class Constant {
	
	//作者
	public static final String AUTHOR="Liguofeng";
	//包名
	public static final String PACKAGE="com.swirebev.mysccapi";
	public static final String[][] CONTENT={
		{"String","agreement_no","协议编号"},
		{"String","outlet_no","客户编号"},
		{"int","base_inv_pricelist","库存价表"},
		{"int","stockin_pricelist","库存盘盈价表"},
		{"int","GT_pricelist","GT价表"},
		{"String","service_fee","固定服务费"},
		{"String","breakage_allowance","破损补贴"},
		{"int","price_config_no","配送费率"},
		{"int","stock_config_no","安全库存"},
		{"int","scale_config_no","安全库存"},
		{"int","KPI_config_no","KPI"},
		{"String","del_adj_list_no","对应后补调整因子编号(copy form W101_config)"},
		{"String","effect_to","协议结束时间"},
		{"String","effect_from","协议生效时间"},
		{"String","remark","备注"},
		{"String","create_by","create user"},
		{"String","create_date","create date"},
		{"String","update_by","update user"},
		{"String","update_date","update date"},
		{"int","utc_adj_list_no","对应后补调整因子编号"},
		{"int","price_modify_control","修改价格 1可修改，0不可修改"},
		{"int","print_page_type","专属打印类型 连打/单张打"},
		{"String","max_capacity","最大库存"},
		{"int","ds_price_config_no","代送配送费率"},
		{"String","replacement_adj_list_no","不良品兑换后补协议编号"},
		{"int","ws_price_config_no","批发渠道配送费率"},
		{"String","company_code",""}
		};
	
	/*
	 * 模板位置
	 */
	public static final String BEAN_TEMPLATE="CodeTemplate/Bean.java.ftl";
	public static final String DAO_TEMPLATE="CodeTemplate/DAO.java.ftl";
	public static final String SERVICE_TEMPLATE="CodeTemplate/Service.java.ftl";
	public static final String SERVICE_IMPL_TEMPLATE="CodeTemplate/ServiceImpl.java.ftl";
	public static final String CONTROLLER_TEMPLATE="CodeTemplate/Controller.java.ftl";
	

	/*
	 * 代码生成位置
	 */
	public static final String DAO_PACKAGE=PACKAGE+".dao.crm";
	public static final String SERVICE_PACKAGE=PACKAGE + ".services.crm";
	public static final String SERVICE_IMPL_PACKAGE=PACKAGE + ".services.crm";
	public static final String CONTROLLER_PACKAGE = PACKAGE + ".controller.crm";
	

	//代码中用到的变量:GeneratorAbstract类genJavaModel方法中
	public static final String DAO="DAO";
	public static final String SERVICE="Service";
	public static final String SERVICEImpl="ServiceImpl";
	public static final String CONTROLLER = "Controller";
	
}
