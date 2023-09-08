package org.green.service;

import java.util.List;

import org.green.domain.MemberDTO;

public interface MemberService {
	//회원 목록 페이지
	public List<MemberDTO> getMemberList();
	
	//회원 가입  페이지 
	public void register (MemberDTO mdto);
}
