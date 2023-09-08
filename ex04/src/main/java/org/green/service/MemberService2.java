package org.green.service;

import java.util.List;

import org.green.domain.MemberDTO2;

public interface MemberService2 {
	//등록
	public void register(MemberDTO2 mto);
	//조회
	public List<MemberDTO2> getList();
	
}
