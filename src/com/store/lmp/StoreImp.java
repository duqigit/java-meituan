package com.store.lmp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.meituan.util.GetJson;
import com.meituan.util.HibernateSessionFactory;
import com.store.dao.StoreDao;
import com.store.entity.Classes;
import com.store.entity.Store;

public class StoreImp implements StoreDao{
	public ArrayList getStoreList(ArrayList storeuid,JSONArray contents) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		ArrayList storelist=new ArrayList();
		try {
			int i = 0;
			for (Object  object: storeuid) {
				Store store=(Store) session.createQuery("from Store where uid ="+object).uniqueResult();
				JSONObject jsonobject=new JSONObject();
				jsonobject.put("uid", store.getUid());
				jsonobject.put("name", store.getName());
				jsonobject.put("img", store.getImg());
				jsonobject.put("send", store.getSend());
				jsonobject.put("isvip", store.getIsvip());
				jsonobject.put("isbrand", store.getIsbrand());
				jsonobject.put("discount", store.getDiscount());
				jsonobject.put("time", store.getTime());
				jsonobject.put("average", store.getAverage());
				jsonobject.put("distributionfee", store.getDistributionfee());
				jsonobject.put("firstorder", store.getFirstorder());
				jsonobject.put("discounts", store.getDiscounts());
				jsonobject.put("storeinfo", contents.get(i));
				i++;
				storelist.add(jsonobject);;
			}
		} catch (Exception e){ 
			if(tx!=null){
				tx.rollback();
			}
		}finally{
			if(session!=null){
				session.close();
			}
				
		}
		return storelist;
	}

	public ArrayList Storeinfo(Store store) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		ArrayList classlist=new ArrayList();
		Classes classes=new Classes();
		classes.setStore(store);
		try {
			 List<Classes> classeslist= session.createQuery("from Classes where uid = "+store).list();
//			 System.out.println(classeslist+"---------");
//			 System.out.println(classeslist.size()+"-----------");
//			 for (int i = 0; i < classeslist.size(); i++) {
//				JSONObject jsonobject=new JSONObject();
//				System.out.println(classeslist.get(i).getId());
//				jsonobject.put("uid",classeslist.get(i).getId());
//				jsonobject.put("name",classeslist.get(i).getName());
//				
//			}
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();
			}
		}finally{
			if(session!=null){
				session.close();
			}
		}

		return classlist;
	}

}
