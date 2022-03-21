package com.example.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lmt_feature")
public class lmt_feature {

	@Id
	@Column(name = "FEATURE")
	private String feature;

	@Column(name = "APPLICATION")
	private String application;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	@Override
	public String toString() {
		return "lmt_feature [feature=" + feature + ", application=" + application + "]";
	}

}
