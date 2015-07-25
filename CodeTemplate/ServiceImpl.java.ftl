package ${model.packageName};

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myscc.commons.bean.crm.${model.beanName};
import com.swirebev.mysccapi.dao.crm.${model.beanName}DAO;


/**
 * create Date: ${contentModel.date?string("yyyy-MM-dd HH:mm:ss")}
   @author ${contentModel.author}
 */
 
 <#assign instance="${model.beanName?uncap_first}">
 <#assign dao="${model.beanName}DAO">
<#-- 默认第一个属性是ID -->
<#list pList as p>
	<#if p_index=0>
		<#assign ID="${p.properties}">
		<#assign IDType="${p.type}">
	</#if>
</#list> 
@Service("${model.beanName}ServicesImpl")
public class ${model.beanName}ServicesImpl implements I${model.beanName}Services{

    @Autowired
    private ${dao} ${dao?uncap_first};

    //private ${model.beanName}DAO objDao;

	
	/**
     * 增加 ${model.beanName}
     * @param ${instance}
     */
    public void add${model.beanName}(${model.beanName} ${instance}) throws Exception{
    	this.${dao?uncap_first}.add${model.beanName}(${instance});
    }

    /**
     * 更新 ${model.beanName}
     * @param ${instance}
     */
    public void update${model.beanName}(${model.beanName} ${instance}) throws Exception{
    	this.${dao?uncap_first}.update${model.beanName}(${instance});
    }
    
    /** 
     * 删除 ${model.beanName}
     * @param id
     */
    public void delete${model.beanName}(${IDType} ${ID}) throws Exception{
    	this.${dao?uncap_first}.delete${model.beanName}(${ID});
    }
    
    /**
     * 获取所有${model.beanName}信息
     * @return
     */
    public List<${model.beanName}> query${model.beanName}All() throws Exception{
    	return this.${dao?uncap_first}.query${model.beanName}All();
    }
    
    /**
     * 根据${ID}获取${model.beanName}信息
     * @param id
     * @return
     */
    public ${model.beanName} query${model.beanName}ById(${IDType} ${ID}) throws Exception{
    	return this.${dao?uncap_first}.query${model.beanName}ById(${ID});
    }  

}
