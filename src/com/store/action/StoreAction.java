package com.store.action;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.meituan.util.GetJson;
import com.opensymphony.xwork2.ActionSupport;
import com.store.dao.StoreDao;
import com.store.entity.Store;
import com.store.lmp.StoreImp;


public class StoreAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void getStore() throws IOException {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response= ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String longitude=request.getParameter("longitude");
		String latitude=request.getParameter("latitude");
		String location=longitude+","+latitude;
	      try
	      {
	         URL url = new URL("http://api.map.baidu.com/geosearch/v3/nearby?ak=U2ELGNcAWBzW5zCf3cUFAsQvfAlWeSIE&geotable_id=130836&location="+location+"&radius=1000000&sortby=distance:1");
	         URLConnection urlConnection = url.openConnection();
	         HttpURLConnection connection = null;
	         if(urlConnection instanceof HttpURLConnection)
	         {
	            connection = (HttpURLConnection) urlConnection;
	         }
	         else
	         {
	            System.out.println("请输入 URL 地址");
	            return;
	         }
	         BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             String urlString = "";
             String current;
             while((current = in.readLine()) != null)
             {
                urlString += current;
             }
             JSONObject json = JSONObject.fromObject(urlString);
             if(json.get("status").equals(0)){
            	 JSONArray contents = json.getJSONArray("contents");
            	 ArrayList list = new ArrayList();
        		 DecimalFormat df = new DecimalFormat("0.00");
            	 for (int i = 0; i < contents.size(); i++) {            		 
            		 contents.getJSONObject(i).put("distance",df.format((float) Integer.parseInt(contents.getJSONObject(i).getString("distance"))/1000));
                	 list.add(i,contents.getJSONObject(i).getString("uid"));
            	 }
            	 StoreDao storedao= new StoreImp();
            	 ArrayList storelist = storedao.getStoreList(list,contents);
            	 out.print(GetJson.GetJson("0", "获取成功", storelist));
             }else{
            	 
             }
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
		
	}
	
	public void getStoreinfo() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response= ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uid =request.getParameter("uid");
		Store store=new Store();
		store.setUid(uid);
		StoreDao storedao=new StoreImp();
		ArrayList classstore = storedao.Storeinfo(store);
		out.print(classstore);
		
	}
}
