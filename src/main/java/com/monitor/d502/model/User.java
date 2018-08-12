package com.monitor.d502.model;

import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String emil;
	@ManyToMany(fetch = FetchType.EAGER) // 立即从数据库中进行加载数据
	@JoinTable(name = "SysUserDevice", joinColumns = { @JoinColumn(name = "uid") }, inverseJoinColumns = {
			@JoinColumn(name = "deviceId") })
	private List<Device> deviceList;// 一个用户管理多个设备

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public List<Device> getDeviceList() {
		return deviceList;
	}

	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}

}
