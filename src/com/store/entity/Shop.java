package com.store.entity;

/**
 * Shop entity. @author MyEclipse Persistence Tools
 */

public class Shop implements java.io.Serializable {

	// Fields

	private Integer id;
	private Classes classes;
	private String shopname;
	private Integer shopprice;
	private String isdiscount;
	private String discountprice;
	private String mgurl;

	// Constructors

	/** default constructor */
	public Shop() {
	}

	/** full constructor */
	public Shop(Integer id, Classes classes, String shopname,
			Integer shopprice, String isdiscount, String discountprice,
			String mgurl) {
		this.id = id;
		this.classes = classes;
		this.shopname = shopname;
		this.shopprice = shopprice;
		this.isdiscount = isdiscount;
		this.discountprice = discountprice;
		this.mgurl = mgurl;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Integer getShopprice() {
		return this.shopprice;
	}

	public void setShopprice(Integer shopprice) {
		this.shopprice = shopprice;
	}

	public String getIsdiscount() {
		return this.isdiscount;
	}

	public void setIsdiscount(String isdiscount) {
		this.isdiscount = isdiscount;
	}

	public String getDiscountprice() {
		return this.discountprice;
	}

	public void setDiscountprice(String discountprice) {
		this.discountprice = discountprice;
	}

	public String getMgurl() {
		return this.mgurl;
	}

	public void setMgurl(String mgurl) {
		this.mgurl = mgurl;
	}

}