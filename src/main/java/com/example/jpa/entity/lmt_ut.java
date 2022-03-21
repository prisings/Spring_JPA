package com.example.jpa.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: lmt_ut
 *
 */
@Entity
@Table(name="lmt_ut")
public class lmt_ut  {
	
	@Id
	@Column(name = "FEATURE")
	private String feature;
	
	@Column(name = "TOTAL")
	private int total;
	
	@Column(name = "USE")
	private int use;
	
	@Column(name = "UT")
	private int ut;
	
	@Column(name = "TIMESTAMP")
	private Timestamp timestamp;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getUse() {
		return use;
	}

	public void setUse(int use) {
		this.use = use;
	}

	public int getUt() {
		return ut;
	}

	public void setUt(int ut) {
		this.ut = ut;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "lmt_ut [feature=" + feature + ", total=" + total + ", use=" + use + ", ut=" + ut + ", timestamp="
				+ timestamp + "]";
	}
   
	
}
