//package ${model.packageName};
package com.myscc.commons.bean.crm;

/**
 * create Date: ${contentModel.date?string("yyyy-MM-dd HH:mm:ss")}
 * @author ${contentModel.author}
 */
public class ${model.className}{

<#list pList as p>
      private ${p.type} ${p.properties}; //${p.content}
 </#list>   
 
 <#list pList as p> 
      public void set${p.properties?cap_first}(${p.type} ${p.properties}){
      	this.${p.properties}=${p.properties};
      }
      
      public ${p.type} get${p.properties?cap_first}(){
      	return ${p.properties};
      }
</#list>
 
}