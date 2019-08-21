package com.sai.om.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="mobile_table")
public class MobileDTO implements Serializable{
	
	public MobileDTO() {
	System.out.println(this.getClass().getSimpleName()+"created");
	}
	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	@Column(name="mobile_id")
	private int mobileid;
	@Column(name="mobile_brand")
	private String mobilebrand;
	@Column(name="mobile_type")
	private String mobiletype;
	@Column(name="mobile_cost")
	private double mobilecost;
	
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
	public String getMobilebrand() {
		return mobilebrand;
	}
	public void setMobilebrand(String mobilebrand) {
		this.mobilebrand = mobilebrand;
	}
	public String getMobiletype() {
		return mobiletype;
	}
	public void setMobiletype(String mobiletype) {
		this.mobiletype = mobiletype;
	}
	public double getMobilecost() {
		return mobilecost;
	}
	public void setMobilecost(double mobilecost) {
		this.mobilecost = mobilecost;
	}
	
	

}
