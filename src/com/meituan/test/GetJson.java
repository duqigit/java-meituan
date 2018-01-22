package com.meituan.test;

import java.util.ArrayList;

import net.sf.json.JSONObject;

public class GetJson {
	
	public static String GetJson(String code,String message,ArrayList jsonobj){
		String jsonstr="{\"code\":"+code+",\"message\":"+"\""+message+"\""+",\"data\":"+jsonobj+"}";
		return jsonstr;
	};

}
