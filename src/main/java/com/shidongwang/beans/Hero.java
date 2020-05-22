package com.shidongwang.beans;

public class Hero {

	private Integer hid;
	
	private String hname;
	
	private Double price;
	
	private Integer cid;
	
	private String uptime;
	
	private Integer status;
	
	private String picurl;

	private String cname;
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hero(Integer hid, String hname, Double price, Integer cid, String uptime, Integer status, String picurl) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.price = price;
		this.cid = cid;
		this.uptime = uptime;
		this.status = status;
		this.picurl = picurl;
	}

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	
	
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Hero [hid=" + hid + ", hname=" + hname + ", price=" + price + ", cid=" + cid + ", uptime=" + uptime
				+ ", status=" + status + ", picurl=" + picurl + "]";
	}
	
	
}
