package com.kh.app04.member.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.kh.app04.member.vo.MemberVo;

public class MemberDao {
	
	public int join(SqlSessionTemplate sst, MemberVo vo) {
		return sst.insert("", vo);
	}

}
