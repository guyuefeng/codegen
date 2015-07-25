package com.swirebev.mysccapi.services.crm;

import java.util.List;
import java.util.Map;

import com.myscc.commons.bean.crm.CRMDictionary;
/**
 * create Date: 2015-07-22 14:35:14
   @author Liguofeng
 */
 
public interface ICRMDictionaryService{
	 /**
     * 获取所有CRMDictionary信息
     * @return
     */
    public List<CRMDictionary> queryCRMDictionaryAll() throws Exception;

    /**
     * 增加 CRMDictionary
     * @param
     */
    @SuppressWarnings("rawtypes")
    public Map addCRMDictionary(CRMDictionary cRMDictionary) throws Exception;

     /**
     * update CRMDictionary
     * @param cRMDictionary
     */
    @SuppressWarnings("rawtypes")
    public void updateCRMDictionary(CRMDictionary cRMDictionary) throws Exception;
    
     /** 
     * delete CRMDictionary
     * @param id
     */
    @SuppressWarnings("rawtypes")
    public boolean deleteCRMDictionary(String agreement_no) throws Exception;
    
    
    
     /**
     * 根据ID获取CRMDictionary信息
     * @param id
     * @return
     */
    public CRMDictionary queryCRMDictionaryById(String id) throws Exception;    


}
