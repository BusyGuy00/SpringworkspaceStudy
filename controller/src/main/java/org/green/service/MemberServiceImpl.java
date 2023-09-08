package org.green.service;

import java.util.List;

import org.green.domain.AuthVO;
import org.green.domain.MemberVO;
import org.green.mapper.MemberAuthMapper;
import org.green.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	@Setter(onMethod_= {@Autowired} )
	private MemberMapper Mapper;
	@Setter(onMethod_= {@Autowired} )
	private MemberAuthMapper AMapper;
	@Setter(onMethod_= {@Autowired} )
	private PasswordEncoder pwEncoder;

	@Override
	public List<MemberVO> getMemberList() {
		List<MemberVO> memberList =  Mapper.getList();
		return memberList;
	}

//	@Override
//	public void register(MemberVO mvo, AuthVO avo) {
//		Mapper.insert(mvo);
//		AMapper.Ainsert(avo);
//	}
	@Override
	public void register(MemberVO mvo, AuthVO avo) {
		mvo.setUserpw(pwEncoder.encode(mvo.getUserpw()));
		Mapper.insert(mvo);
		AMapper.Ainsert(avo);
	}
}
