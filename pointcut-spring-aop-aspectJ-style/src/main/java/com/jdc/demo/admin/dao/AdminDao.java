package com.jdc.demo.admin.dao;

import org.springframework.stereotype.Repository;

import com.jdc.demo.utils.NeedToLogBefore;

@NeedToLogBefore
@Repository
public class AdminDao {

	public void searchData() {
		System.out.println("Admin Dao Search!");
	}
	
	public void saveSomething() {
		System.out.println("Save something of Admin Dao!");
	}
}
