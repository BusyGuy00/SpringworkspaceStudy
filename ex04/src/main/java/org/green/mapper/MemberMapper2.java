package org.green.mapper;

import java.util.List;

import org.green.domain.MemberDTO2;

public interface MemberMapper2 {
	//리스트
	public List<MemberDTO2> getList();
	//인설트
	public void insert(MemberDTO2 mto);
}
