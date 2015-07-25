package com.swirebev.mysccapi.services.crm;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myscc.commons.bean.crm.CRMDictionary;
import com.swirebev.mysccapi.dao.crm.CRMDictionaryDAO;


/**
 * create Date: 2015-07-22 14:35:13
   @author Liguofeng
 */
 
@Service("CRMDictionaryServicesImpl")
public class CRMDictionaryServicesImpl implements ICRMDictionaryServices{

    @Autowired
    private CRMDictionaryDAO cRMDictionaryDAO;

    //private CRMDictionaryDAO objDao;

	
	/**
     * 增加 CRMDictionary
     * @param cRMDictionary
     */
    public void addCRMDictionary(CRMDictionary cRMDictionary) throws Exception{
    	this.cRMDictionaryDAO.addCRMDictionary(cRMDictionary);
    }

    /**
     * 更新 CRMDictionary
     * @param cRMDictionary
     */
    public void updateCRMDictionary(CRMDictionary cRMDictionary) throws Exception{
    	this.cRMDictionaryDAO.updateCRMDictionary(cRMDictionary);
    }
    
    /** 
     * 删除 CRMDictionary
     * @param id
     */
    public void deleteCRMDictionary(String agreement_no) throws Exception{
    	this.cRMDictionaryDAO.deleteCRMDictionary(agreement_no);
    }
    
    /**
     * 获取所有CRMDictionary信息
     * @return
     */
    public List<CRMDictionary> queryCRMDictionaryAll() throws Exception{
    	return this.cRMDictionaryDAO.queryCRMDictionaryAll();
    }
    
    /**
     * 根据agreement_no获取CRMDictionary信息
     * @param id
     * @return
     */
    public CRMDictionary queryCRMDictionaryById(String agreement_no) throws Exception{
    	return this.cRMDictionaryDAO.queryCRMDictionaryById(agreement_no);
    }  

}
