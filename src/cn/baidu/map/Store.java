package cn.baidu.map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class Store extends ActionSupport{
	public void getStore() throws IOException {
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpServletResponse response= ServletActionContext.getResponse();
//		PrintWriter out = response.getWriter();
//		String longitude=request.getParameter("longitude");
//		String latitude=request.getParameter("latitude");
//		String location=longitude+","+latitude;
		String location="121.414735,31.20991";
	      try
	      {
	         URL url = new URL("http://api.map.baidu.com/geosearch/v3/nearby?ak=U2ELGNcAWBzW5zCf3cUFAsQvfAlWeSIE&geotable_id=130836&location="+location+"&radius=100000");
	         URLConnection urlConnection = url.openConnection();
	         HttpURLConnection connection = null;
	         if(urlConnection instanceof HttpURLConnection)
	         {
	            connection = (HttpURLConnection) urlConnection;
	         }
	         else
	         {
	            System.out.println("«Î ‰»Î URL µÿ÷∑");
	            return;
	         }
	         BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             String urlString = "";
             String current;
             while((current = in.readLine()) != null)
             {
                urlString += current;
             }
//             System.out.println(urlString);
             JSONObject json = JSONObject.fromObject(urlString);
//             System.out.println(json.get("status"));
             System.out.println(json.get("status").equals(0));
             if(json.get("status").equals(0)){
//            	 System.out.println(11111);
//            	 ArrayList<Object> contentlist = json.get("contents");
//            	 JSONArray jsonarry= (JSONArray) json.get("contents");
//            	 while (it.hasNext()) {
//					type type = (type) it.next();
//					
//				}
             }else{
            	 System.out.println(111);
             }
//             System.out.println(json);
//             System.err.println(urlString);
//             out.print(json);
//             out.print(urlString);
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	      }
		
	}
}
