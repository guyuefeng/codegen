package com.swirebev.mysccapi.dao.crm;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.myscc.commons.bean.crm.CRMDictionary;



/**
 * create Date:2015-07-22 14:35:14
   @author Liguofeng
 */
 

@Repository("CRMDictionaryDAO")
public class CRMDictionaryDAO {

	private static Logger logger = LoggerFactory.getLogger(CRMDictionaryDAO.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

 
    /**
     * 获取所有CRMDictionary信息
     * @return
     */
    public List<CRMDictionary> getCRMDictionary(CRMDictionary cRMDictionary){
    	String sql = "{call P_CRM_getCRMDictionary(?)}";
		List<CRMDictionary> resultList = jdbcTemplate.query(sql,new Object[] {cRMDictionary.getagreement_no()}, new RowMapper<CRMDictionary>() {
					@Override
					public CRMDictionary mapRow(ResultSet rs, int rowNum) throws SQLException {
						CRMDictionary tempObj = new CRMDictionary();
						try {
					        tempObj.setOutlet_no(rs.getString("Outlet_no"));
					        tempObj.setBase_inv_pricelist(rs.getint("Base_inv_pricelist"));
					        tempObj.setStockin_pricelist(rs.getint("Stockin_pricelist"));
					        tempObj.setGT_pricelist(rs.getint("GT_pricelist"));
					        tempObj.setService_fee(rs.getString("Service_fee"));
					        tempObj.setBreakage_allowance(rs.getString("Breakage_allowance"));
					        tempObj.setPrice_config_no(rs.getint("Price_config_no"));
					        tempObj.setStock_config_no(rs.getint("Stock_config_no"));
					        tempObj.setScale_config_no(rs.getint("Scale_config_no"));
					        tempObj.setKPI_config_no(rs.getint("KPI_config_no"));
					        tempObj.setDel_adj_list_no(rs.getString("Del_adj_list_no"));
					        tempObj.setEffect_to(rs.getString("Effect_to"));
					        tempObj.setEffect_from(rs.getString("Effect_from"));
					        tempObj.setRemark(rs.getString("Remark"));
					        tempObj.setCreate_by(rs.getString("Create_by"));
					        tempObj.setCreate_date(rs.getString("Create_date"));
					        tempObj.setUpdate_by(rs.getString("Update_by"));
					        tempObj.setUpdate_date(rs.getString("Update_date"));
					        tempObj.setUtc_adj_list_no(rs.getint("Utc_adj_list_no"));
					        tempObj.setPrice_modify_control(rs.getint("Price_modify_control"));
					        tempObj.setPrint_page_type(rs.getint("Print_page_type"));
					        tempObj.setMax_capacity(rs.getString("Max_capacity"));
					        tempObj.setDs_price_config_no(rs.getint("Ds_price_config_no"));
					        tempObj.setReplacement_adj_list_no(rs.getString("Replacement_adj_list_no"));
					        tempObj.setWs_price_config_no(rs.getint("Ws_price_config_no"));
					        tempObj.setCompany_code(rs.getString("Company_code"));
						} catch (SQLException ex) {
							tempObj = null;
							logger.error("get data exception", ex);
						}
						return tempObj;
					}
				});
		return resultList;
		
    }
    
    
  	/**
     * 增加 CRMDictionary
     * @param cRMDictionary
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map addCRMDictionary(CRMDictionary cRMDictionary){
        final String sql = "{call P_CRM_addCRMDictionary(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";		
		
		Map mapResult = (Map) this.jdbcTemplate.execute(sql,new CallableStatementCallback() {
			public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				int i = 1;
                cs.setString(i++, cRMDictionary.getAgreement_no());
                cs.setString(i++, cRMDictionary.getOutlet_no());
                cs.setint(i++, cRMDictionary.getBase_inv_pricelist());
                cs.setint(i++, cRMDictionary.getStockin_pricelist());
                cs.setint(i++, cRMDictionary.getGT_pricelist());
                cs.setString(i++, cRMDictionary.getService_fee());
                cs.setString(i++, cRMDictionary.getBreakage_allowance());
                cs.setint(i++, cRMDictionary.getPrice_config_no());
                cs.setint(i++, cRMDictionary.getStock_config_no());
                cs.setint(i++, cRMDictionary.getScale_config_no());
                cs.setint(i++, cRMDictionary.getKPI_config_no());
                cs.setString(i++, cRMDictionary.getDel_adj_list_no());
                cs.setString(i++, cRMDictionary.getEffect_to());
                cs.setString(i++, cRMDictionary.getEffect_from());
                cs.setString(i++, cRMDictionary.getRemark());
                cs.setString(i++, cRMDictionary.getCreate_by());
                cs.setString(i++, cRMDictionary.getCreate_date());
                cs.setString(i++, cRMDictionary.getUpdate_by());
                cs.setString(i++, cRMDictionary.getUpdate_date());
                cs.setint(i++, cRMDictionary.getUtc_adj_list_no());
                cs.setint(i++, cRMDictionary.getPrice_modify_control());
                cs.setint(i++, cRMDictionary.getPrint_page_type());
                cs.setString(i++, cRMDictionary.getMax_capacity());
                cs.setint(i++, cRMDictionary.getDs_price_config_no());
                cs.setString(i++, cRMDictionary.getReplacement_adj_list_no());
                cs.setint(i++, cRMDictionary.getWs_price_config_no());
                cs.setString(i++, cRMDictionary.getCompany_code());
				cs.execute();
				Map map = new HashMap();
				//map.put("status", cs.getInt(i++)); //处理结果标识，ERROR_CODE = 500;SUCCESS = 200;
				//map.put("message", cs.getString(i++)); //处理结果信息
				return map;
			}
		});


		return mapResult;
		
    }
     /**
     * update CRMDictionary
     * @param cRMDictionary
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public boolean updateCRMDictionary(CRMDictionary cRMDictionary){
    	String sql = "{call P_CRM_updateCRMDictionary(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?))}";
    	//设置参数
		Map mapResult = (Map) this.jdbcTemplate.execute(sql,new CallableStatementCallback() {
			public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				int i = 1;
                cs.setString(i++, cRMDictionary.getAgreement_no());
                cs.setString(i++, cRMDictionary.getOutlet_no());
                cs.setint(i++, cRMDictionary.getBase_inv_pricelist());
                cs.setint(i++, cRMDictionary.getStockin_pricelist());
                cs.setint(i++, cRMDictionary.getGT_pricelist());
                cs.setString(i++, cRMDictionary.getService_fee());
                cs.setString(i++, cRMDictionary.getBreakage_allowance());
                cs.setint(i++, cRMDictionary.getPrice_config_no());
                cs.setint(i++, cRMDictionary.getStock_config_no());
                cs.setint(i++, cRMDictionary.getScale_config_no());
                cs.setint(i++, cRMDictionary.getKPI_config_no());
                cs.setString(i++, cRMDictionary.getDel_adj_list_no());
                cs.setString(i++, cRMDictionary.getEffect_to());
                cs.setString(i++, cRMDictionary.getEffect_from());
                cs.setString(i++, cRMDictionary.getRemark());
                cs.setString(i++, cRMDictionary.getCreate_by());
                cs.setString(i++, cRMDictionary.getCreate_date());
                cs.setString(i++, cRMDictionary.getUpdate_by());
                cs.setString(i++, cRMDictionary.getUpdate_date());
                cs.setint(i++, cRMDictionary.getUtc_adj_list_no());
                cs.setint(i++, cRMDictionary.getPrice_modify_control());
                cs.setint(i++, cRMDictionary.getPrint_page_type());
                cs.setString(i++, cRMDictionary.getMax_capacity());
                cs.setint(i++, cRMDictionary.getDs_price_config_no());
                cs.setString(i++, cRMDictionary.getReplacement_adj_list_no());
                cs.setint(i++, cRMDictionary.getWs_price_config_no());
                cs.setString(i++, cRMDictionary.getCompany_code());
				cs.execute();
				Map map = new HashMap();
				//map.put("status", cs.getInt(9)); //处理结果标识，ERROR_CODE = 500;SUCCESS = 200;
				//map.put("message", cs.getString(10)); //处理结果信息
				return map;
			}
		});	

		return mapResult;
		
    }

    /** 
     * delete CRMDictionary
     * @param id
     */
    public Map deleteCRMDictionary(CRMDictionary cRMDictionary){
    	String sql = "{call P_CRM_deleteCRMDictionary(?)}";		
		//设置参数
		Object paramObject[] = new Object[1];
		paramObject[0] = cRMDictionary.agreement_no();
		
		int i = this.jdbcTemplate.update(sql, paramObject);		
		if(i>0){
			return true;
		}else{
			return false;
		}
    }    
    

            
}
