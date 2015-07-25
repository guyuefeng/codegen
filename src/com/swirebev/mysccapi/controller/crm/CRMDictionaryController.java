package com.swirebev.mysccapi.controller.crm;

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
import com.swirebev.mysccapi.services.crm.ICRMDictionaryServices;
import com.swirebev.mysccapi.util.ConstantFields;


/**
 * create Date:2015-07-22 14:35:13
 * @author Liguofeng
 */

@RestController
public class CRMDictionary extends GlobalExceptionController {

	@Autowired
	private ICRMDictionaryServices objServices;
	
	/***
	 *获取全部CRMDictionary数据
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/crm/CRMDictionary", method = RequestMethod.GET)
	public String getCRMDictionary() throws Exception {
		CRMDictionary tempObject = new CRMDictionary();		
		List<CRMDictionary> resultList = CRMDictionaryServices.getCRMDictionary(tempObject);
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
	 * 新增CRMDictionary数据
	 * @param crmDict
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping(value = "/crm/CRMDictionary", method = RequestMethod.POST)
	public String addCRMDictionary(@RequestBody String json) throws Exception {
		CRMDictionary tempObj = JsonHelper.jsonToBean(json, CRMDictionary.class);
		Map mapResult = objServices.addCRMDictionary(tempObj);
		return JsonHelper.beanToJson(mapResult);
	}
	
	/***
	 * 更新CRMDictionary数据
	 * @param crmO
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/crm/CRMDictionary/{agreement_no}", method = RequestMethod.PUT)
	public String updateCRMDictionary(@PathVariable int agreement_no,@RequestBody String json) throws Exception {
		CRMDictionary tempObj = JsonHelper.jsonToBean(json, CRMDictionary.class);
		tempObj.setagreement_no(agreement_no);
		Map mapResult = objServices.updateCRMDictionary(tempObj);
		return JsonHelper.beanToJson(mapResult);
	}
	
	/***
	 * 删除CRMDictionary数据
	 * @param agreement_no
	 * @param json
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/crm/CRMDictionary/{agreement_no}", method = RequestMethod.DELETE)
	public String deleteCRMDictionary(@PathVariable int id) throws Exception {
		CRMDictionary tempObj = new CRMDictionary();
		tempObj.setagreement_no(agreement_no);
		boolean result = objServices.deleteCRMDictionary(tempObj);
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
