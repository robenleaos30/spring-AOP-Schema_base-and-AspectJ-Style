package com.jdc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.demo.AppConfig;
import com.jdc.demo.admin.dao.AdminDao;
import com.jdc.demo.member.dao.MemberDao;

@SpringJUnitConfig(classes = AppConfig.class)
public class PointcutTest {

	@Autowired
	private AdminDao dao;
	
	@Autowired
	private MemberDao member;
	
	@Test
	void test() {
		dao.searchData();
		member.searchData();
	}
}
