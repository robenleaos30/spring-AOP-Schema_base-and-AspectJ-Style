package com.jdc.demo.member.dao;

import org.springframework.stereotype.Repository;

import com.jdc.demo.utils.NeedToLogBefore;

@NeedToLogBefore
@Repository
public class MemberDao {

	public void searchData() {
		System.out.println("Member service search Data!");
	}
}
