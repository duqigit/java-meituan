package com.store.dao;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface StoreDao {
	ArrayList getStoreList(ArrayList storeuid,JSONArray contents);
	
}
