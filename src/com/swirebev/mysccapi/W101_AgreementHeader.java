//package com.swirebev.mysccapi;
package com.myscc.commons.bean.crm;

/**
 * create Date: 2015-07-22 14:35:10
 * @author Liguofeng
 */
public class W101_AgreementHeader{

      private String agreement_no; //协议编号
      private String outlet_no; //客户编号
      private int base_inv_pricelist; //库存价表
      private int stockin_pricelist; //库存盘盈价表
      private int GT_pricelist; //GT价表
      private String service_fee; //固定服务费
      private String breakage_allowance; //破损补贴
      private int price_config_no; //配送费率
      private int stock_config_no; //安全库存
      private int scale_config_no; //安全库存
      private int KPI_config_no; //KPI
      private String del_adj_list_no; //对应后补调整因子编号(copy form W101_config)
      private String effect_to; //协议结束时间
      private String effect_from; //协议生效时间
      private String remark; //备注
      private String create_by; //create user
      private String create_date; //create date
      private String update_by; //update user
      private String update_date; //update date
      private int utc_adj_list_no; //对应后补调整因子编号
      private int price_modify_control; //修改价格 1可修改，0不可修改
      private int print_page_type; //专属打印类型 连打/单张打
      private String max_capacity; //最大库存
      private int ds_price_config_no; //代送配送费率
      private String replacement_adj_list_no; //不良品兑换后补协议编号
      private int ws_price_config_no; //批发渠道配送费率
      private String company_code; //
 
      public void setAgreement_no(String agreement_no){
      	this.agreement_no=agreement_no;
      }
      
      public String getAgreement_no(){
      	return agreement_no;
      }
      public void setOutlet_no(String outlet_no){
      	this.outlet_no=outlet_no;
      }
      
      public String getOutlet_no(){
      	return outlet_no;
      }
      public void setBase_inv_pricelist(int base_inv_pricelist){
      	this.base_inv_pricelist=base_inv_pricelist;
      }
      
      public int getBase_inv_pricelist(){
      	return base_inv_pricelist;
      }
      public void setStockin_pricelist(int stockin_pricelist){
      	this.stockin_pricelist=stockin_pricelist;
      }
      
      public int getStockin_pricelist(){
      	return stockin_pricelist;
      }
      public void setGT_pricelist(int GT_pricelist){
      	this.GT_pricelist=GT_pricelist;
      }
      
      public int getGT_pricelist(){
      	return GT_pricelist;
      }
      public void setService_fee(String service_fee){
      	this.service_fee=service_fee;
      }
      
      public String getService_fee(){
      	return service_fee;
      }
      public void setBreakage_allowance(String breakage_allowance){
      	this.breakage_allowance=breakage_allowance;
      }
      
      public String getBreakage_allowance(){
      	return breakage_allowance;
      }
      public void setPrice_config_no(int price_config_no){
      	this.price_config_no=price_config_no;
      }
      
      public int getPrice_config_no(){
      	return price_config_no;
      }
      public void setStock_config_no(int stock_config_no){
      	this.stock_config_no=stock_config_no;
      }
      
      public int getStock_config_no(){
      	return stock_config_no;
      }
      public void setScale_config_no(int scale_config_no){
      	this.scale_config_no=scale_config_no;
      }
      
      public int getScale_config_no(){
      	return scale_config_no;
      }
      public void setKPI_config_no(int KPI_config_no){
      	this.KPI_config_no=KPI_config_no;
      }
      
      public int getKPI_config_no(){
      	return KPI_config_no;
      }
      public void setDel_adj_list_no(String del_adj_list_no){
      	this.del_adj_list_no=del_adj_list_no;
      }
      
      public String getDel_adj_list_no(){
      	return del_adj_list_no;
      }
      public void setEffect_to(String effect_to){
      	this.effect_to=effect_to;
      }
      
      public String getEffect_to(){
      	return effect_to;
      }
      public void setEffect_from(String effect_from){
      	this.effect_from=effect_from;
      }
      
      public String getEffect_from(){
      	return effect_from;
      }
      public void setRemark(String remark){
      	this.remark=remark;
      }
      
      public String getRemark(){
      	return remark;
      }
      public void setCreate_by(String create_by){
      	this.create_by=create_by;
      }
      
      public String getCreate_by(){
      	return create_by;
      }
      public void setCreate_date(String create_date){
      	this.create_date=create_date;
      }
      
      public String getCreate_date(){
      	return create_date;
      }
      public void setUpdate_by(String update_by){
      	this.update_by=update_by;
      }
      
      public String getUpdate_by(){
      	return update_by;
      }
      public void setUpdate_date(String update_date){
      	this.update_date=update_date;
      }
      
      public String getUpdate_date(){
      	return update_date;
      }
      public void setUtc_adj_list_no(int utc_adj_list_no){
      	this.utc_adj_list_no=utc_adj_list_no;
      }
      
      public int getUtc_adj_list_no(){
      	return utc_adj_list_no;
      }
      public void setPrice_modify_control(int price_modify_control){
      	this.price_modify_control=price_modify_control;
      }
      
      public int getPrice_modify_control(){
      	return price_modify_control;
      }
      public void setPrint_page_type(int print_page_type){
      	this.print_page_type=print_page_type;
      }
      
      public int getPrint_page_type(){
      	return print_page_type;
      }
      public void setMax_capacity(String max_capacity){
      	this.max_capacity=max_capacity;
      }
      
      public String getMax_capacity(){
      	return max_capacity;
      }
      public void setDs_price_config_no(int ds_price_config_no){
      	this.ds_price_config_no=ds_price_config_no;
      }
      
      public int getDs_price_config_no(){
      	return ds_price_config_no;
      }
      public void setReplacement_adj_list_no(String replacement_adj_list_no){
      	this.replacement_adj_list_no=replacement_adj_list_no;
      }
      
      public String getReplacement_adj_list_no(){
      	return replacement_adj_list_no;
      }
      public void setWs_price_config_no(int ws_price_config_no){
      	this.ws_price_config_no=ws_price_config_no;
      }
      
      public int getWs_price_config_no(){
      	return ws_price_config_no;
      }
      public void setCompany_code(String company_code){
      	this.company_code=company_code;
      }
      
      public String getCompany_code(){
      	return company_code;
      }
 
}