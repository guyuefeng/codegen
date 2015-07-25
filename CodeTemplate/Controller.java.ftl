package ${model.packageName};

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myscc.commons.bean.crm.CRMDictionary;
import com.myscc.commons.bean.crm.CRMDictionaryClass;
import com.myscc.commons.jsonhandler.JsonHelper;
import com.myscc.commons.util.HttpJSON;
import com.swirebev.mysccapi.controller.GlobalExceptionController;
import com.swirebev.mysccapi.services.crm.I${model.beanName}Services;
import com.swirebev.mysccapi.util.ConstantFields;


/**
 * create Date:${contentModel.date?string("yyyy-MM-dd HH:mm:ss")}
 * @author ${contentModel.author}
 */

 <#assign instance="${model.beanName?uncap_first}">
<#-- 默认第一个属性是ID -->
<#list pList as p>
	<#if p_index=0>
		<#assign ID="${p.properties}">
		<#assign IDType="${p.type}">
	</#if>
</#list> 
@RestController
public class ${model.beanName} extends GlobalExceptionController {

	@Autowired
	private I${model.beanName}Services objServices;
	
	/***
	 *获取全部${model.beanName}数据
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/crm/${model.beanName}", method = RequestMethod.GET)
	public String get${model.beanName}() throws Exception {
		${model.beanName} tempObject = new ${model.beanName}();		
		List<${model.beanName}> resultList = ${model.beanName}Services.get${model.beanName}(tempObject);
		Map<String,Object> map = new HashMap<String,Object>();
		if (resultList != null && resultList.size() > 0) {
			map.put("status", ConstantFields.SUCCESS);
			map.put("resultList",resultList);
		} else {
			map.put("status", ConstantFields.NO_RESULTS);
			map.put("resultList",null);
		}
		return JsonHelper.beanToJson(map);
	}
	
	
	/***
	 * 新增${model.beanName}数据
	 * @param crmDict
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(value = "/crm/${model.beanName}", method = RequestMethod.POST)
	public String add${model.beanName}(@RequestBody String json) throws Exception {
		${model.beanName} tempObj = JsonHelper.jsonToBean(json, ${model.beanName}.class);
		Map mapResult = objServices.add${model.beanName}(tempObj);
		return JsonHelper.beanToJson(mapResult);
	}
	
	/***
	 * 更新${model.beanName}数据
	 * @param crmO
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/crm/${model.beanName}/{${ID}}", method = RequestMethod.PUT)
	public String update${model.beanName}(@PathVariable int ${ID},@RequestBody String json) throws Exception {
		${model.beanName} tempObj = JsonHelper.jsonToBean(json, ${model.beanName}.class);
		tempObj.set${ID}(${ID});
		Map mapResult = objServices.update${model.beanName}(tempObj);
		return JsonHelper.beanToJson(mapResult);
	}
	
	/***
	 * 删除${model.beanName}数据
	 * @param ${ID}
	 * @param json
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/crm/${model.beanName}/{${ID}}", method = RequestMethod.DELETE)
	public String delete${model.beanName}(@PathVariable int id) throws Exception {
		${model.beanName} tempObj = new ${model.beanName}();
		tempObj.set${ID}(${ID});
		boolean result = objServices.delete${model.beanName}(tempObj);
		Map<String,Object> map = new HashMap<String,Object>();
		if (result) {
			map.put("status", ConstantFields.SUCCESS);
			map.put("message", "删除成功!");
		} else {
			map.put("status", ConstantFields.ERROR_CODE);
			map.put("message", "删除失败!");
		}
		return JsonHelper.beanToJson(map);
	}

}
