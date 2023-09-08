package org.green.service;

import java.util.List;

import org.green.domain.MemberDTO2;
import org.green.mapper.MemberMapper;
import org.green.mapper.MemberMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl2 implements MemberService2 {
	
	@Setter(onMethod_= {@Autowired} )
	private MemberMapper2 mapper;
	@Override
	public void register(MemberDTO2 mto) {
		log.info("등록하기 : " + mto);
		mapper.insert(mto);
	}

	@Override
	public List<MemberDTO2> getList() {
		log.info("리스트 출력");
		return mapper.getList();
	}
	

}
