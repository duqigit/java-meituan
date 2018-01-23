package com.store.dao;

import java.util.ArrayList;

import com.store.entity.Store;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface StoreDao {
	ArrayList getStoreList(ArrayList storeuid,JSONArray contents);
	ArrayList Storeinfo(Store store);
}
