package com.dubbo.core.common.entity;

import java.io.Serializable;

public class Position implements Serializable {

	private static final long serialVersionUID = -5397806287519289504L;
	
	private String id;
	private String name;
	private String deptId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

}
