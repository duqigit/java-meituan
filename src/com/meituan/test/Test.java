package com.meituan.test;

import com.meituan.util.GetJson;
import com.store.dao.StoreDao;
import com.store.entity.Classes;
import com.store.entity.Store;
import com.store.lmp.StoreImp;


public class Test {
	
	public static void main(String[] args) {
//		StoreDao store=new StoreDao();
//		store.getStore();
		Classes classes=new Classes();
		StoreDao storedao=new StoreImp();
		Store store=new Store();
		store.setUid("2412375570");
		storedao.Storeinfo(store);		
	}
}
