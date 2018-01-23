package com.meituan.util;

import java.util.ArrayList;

import java.lang.reflect.Field;


import net.sf.json.JSONObject;

public class GetJson {
	
	public static String GetJson(String code,String message,ArrayList jsonobj){
		String jsonstr="{\"code\":"+code+",\"message\":"+"\""+message+"\""+",\"data\":"+jsonobj+"}";
		return jsonstr;
	};
	public static String[] getFiledName(Object o){  
	    Field[] fields=o.getClass().getDeclaredFields();  
	    String[] fieldNames=new String[fields.length];  
	    for(int i=0;i<fields.length;i++){  
	        fieldNames[i]=fields[i].getName();
	    }
	    return fieldNames;  
	}

}
