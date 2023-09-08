package org.green.mapper;

import java.util.List;

import org.green.domain.MemberDTO;

public interface MemberMapper {

	//회원가입
	public void join (MemberDTO dto);
	
	//회원 목록 페이지 
	public List<MemberDTO> getMemberList();
	
	
}
