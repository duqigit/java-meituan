package com.store.entity;

/**
 * Store entity. @author MyEclipse Persistence Tools
 */

public class Store implements java.io.Serializable {

	// Fields

	private Integer id;
	private String uid;
	private String name;
	private String img;
	private String longitude;
	private String latitude;
	private String send;
	private String isvip;
	private String isbrand;
	private String discount;
	private String average;
	private String time;
	private String distributionfee;
	private String firstorder;
	private String discounts;

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** full constructor */
	public Store(Integer id, String uid, String name, String img,
			String longitude, String latitude, String send, String isvip,
			String isbrand, String discount, String average, String time,
			String distributionfee, String firstorder, String discounts) {
		this.id = id;
		this.uid = uid;
		this.name = name;
		this.img = img;
		this.longitude = longitude;
		this.latitude = latitude;
		this.send = send;
		this.isvip = isvip;
		this.isbrand = isbrand;
		this.discount = discount;
		this.average = average;
		this.time = time;
		this.distributionfee = distributionfee;
		this.firstorder = firstorder;
		this.discounts = discounts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getSend() {
		return this.send;
	}

	public void setSend(String send) {
		this.send = send;
	}

	public String getIsvip() {
		return this.isvip;
	}

	public void setIsvip(String isvip) {
		this.isvip = isvip;
	}

	public String getIsbrand() {
		return this.isbrand;
	}

	public void setIsbrand(String isbrand) {
		this.isbrand = isbrand;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getAverage() {
		return this.average;
	}

	public void setAverage(String average) {
		this.average = average;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDistributionfee() {
		return this.distributionfee;
	}

	public void setDistributionfee(String distributionfee) {
		this.distributionfee = distributionfee;
	}

	public String getFirstorder() {
		return this.firstorder;
	}

	public void setFirstorder(String firstorder) {
		this.firstorder = firstorder;
	}

	public String getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}

}