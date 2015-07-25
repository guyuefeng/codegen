package ${model.packageName};

import java.util.List;
import java.util.Map;

import com.myscc.commons.bean.crm.${model.beanName};
/**
 * create Date: ${contentModel.date?string("yyyy-MM-dd HH:mm:ss")}
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
public interface ${model.className}{
	 /**
     * 获取所有${model.beanName}信息
     * @return
     */
    public List<${model.beanName}> query${model.beanName}All() throws Exception;

    /**
     * 增加 ${model.beanName}
     * @param
     */
    @SuppressWarnings("rawtypes")
    public Map add${model.beanName}(${model.beanName} ${instance}) throws Exception;

     /**
     * update ${model.beanName}
     * @param ${instance}
     */
    @SuppressWarnings("rawtypes")
    public void update${model.beanName}(${model.beanName} ${instance}) throws Exception;
    
     /** 
     * delete ${model.beanName}
     * @param id
     */
    @SuppressWarnings("rawtypes")
    public boolean delete${model.beanName}(${IDType} ${ID}) throws Exception;
    
    
    
     /**
     * 根据ID获取${model.beanName}信息
     * @param id
     * @return
     */
    public ${model.beanName} query${model.beanName}ById(String id) throws Exception;    


}
