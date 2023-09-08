package org.green.service;

import java.util.List;

import org.green.domain.AuthVO;
import org.green.domain.MemberVO;

public interface MemberService {

	//회원 목록 페이지
	public List<MemberVO> getMemberList();
			
	//회원 가입  페이지 
	public void register (MemberVO mvo, AuthVO avo);
}
