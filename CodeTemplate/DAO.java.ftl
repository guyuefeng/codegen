package ${model.packageName};


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

import com.myscc.commons.bean.crm.${model.beanName};



/**
 * create Date:${contentModel.date?string("yyyy-MM-dd HH:mm:ss")}
   @author ${contentModel.author}
 */
 
<#assign instance="${model.beanName?uncap_first}">
<#-- 默认第一个属性是ID -->
<#list pList as p>
	<#if p_index=0>
		<#assign ID="${p.properties}">
		<#assign IDType="${p.type}">
	</#if>
</#list> 

@Repository("${model.className}")
public class ${model.className} {

	private static Logger logger = LoggerFactory.getLogger(${model.className}.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

 
    /**
     * 获取所有${model.beanName}信息
     * @return
     */
    public List<${model.beanName}> get${model.beanName}(${model.beanName} ${instance}){
    	String sql = "{call P_CRM_get${model.beanName}(?)}";
		List<${model.beanName}> resultList = jdbcTemplate.query(sql,new Object[] {${instance}.get${ID}()}, new RowMapper<${model.beanName}>() {
					@Override
					public ${model.beanName} mapRow(ResultSet rs, int rowNum) throws SQLException {
						${model.beanName} tempObj = new ${model.beanName}();
						try {
							<#list pList as p>
							<#if p_index gt 0>
					        tempObj.set${p.properties?cap_first}(rs.get${p.type}("${p.properties?cap_first}"));
							</#if>
					 		</#list>					
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
     * 增加 ${model.beanName}
     * @param ${instance}
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map add${model.beanName}(${model.beanName} ${instance}){
        final String sql = "{call P_CRM_add${model.beanName}(<#list pList as p><#if p_has_next>?,<#else>?</#if></#list>)}";		
		
		Map mapResult = (Map) this.jdbcTemplate.execute(sql,new CallableStatementCallback() {
			public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				int i = 1;
				<#list pList as p>
                cs.set${p.type}(i++, ${instance}.get${p.properties?cap_first}());
         		</#list>
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
     * update ${model.beanName}
     * @param ${instance}
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public boolean update${model.beanName}(${model.beanName} ${instance}){
    	String sql = "{call P_CRM_update${model.beanName}(<#list pList as p><#if p_has_next>?,<#else>?</#if></#list>))}";
    	//设置参数
		Map mapResult = (Map) this.jdbcTemplate.execute(sql,new CallableStatementCallback() {
			public Object doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
				int i = 1;
				<#list pList as p>
                cs.set${p.type}(i++, ${instance}.get${p.properties?cap_first}());
         		</#list>
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
     * delete ${model.beanName}
     * @param id
     */
    public Map delete${model.beanName}(${model.beanName} ${instance}){
    	String sql = "{call P_CRM_delete${model.beanName}(?)}";		
		//设置参数
		Object paramObject[] = new Object[1];
		paramObject[0] = ${instance}.${ID}();
		
		int i = this.jdbcTemplate.update(sql, paramObject);		
		if(i>0){
			return true;
		}else{
			return false;
		}
    }    
    

            
}
