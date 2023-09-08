package org.green.mapper;

import java.util.List;


import org.green.domain.MemberVO;

public interface MemberMapper {
				//userid를 읽어 온다.
	public MemberVO read(String userid);
	
	//리스트
	public List<MemberVO> getList();
	//인설트
	public void insert(MemberVO mvo);
}
