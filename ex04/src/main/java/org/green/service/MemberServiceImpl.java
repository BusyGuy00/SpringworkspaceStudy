package org.green.service;

import java.util.List;

import org.green.domain.MemberDTO;
import org.green.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	@Setter(onMethod_= {@Autowired} )
	private MemberMapper membermapper;

	@Override
	public List<MemberDTO> getMemberList() {
		List<MemberDTO> memberList = membermapper.getMemberList();
		return memberList;
	}

	@Override
	public void register(MemberDTO mdto) {
		membermapper.join(mdto);
	}
	
}
