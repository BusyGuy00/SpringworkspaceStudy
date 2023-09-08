package org.green.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.green.domain.BoardVO;
import org.green.domain.Criteria;
import org.green.persistence.TimeMapperTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Setter(onMethod_= {@Autowired} )
	private BoardMapper mapper;
	@Test
	public void testGetList() {
		//데이터들을 리스트(배열)로 받아서 forEach를 통해서 출력 시킨다.
		mapper.getList().forEach(board -> log.info(board));
	}
	//Insert처리 테스트 
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로작성하는 제목");
		board.setContent("새로작성하는 내용");
		board.setWriter("green");
		mapper.insert(board);
		log.info(board);
	}
	//select처리 테스트 
	@Test
	public void testRead() {
		BoardVO board = mapper.read(5L);
		log.info(board);
	} 
	//delete 처리 테스트 
	@Test
	public void testDelete() {
		log.info("Delete count : " + mapper.delete(3L));
	}
	//update 테스트 
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setBno(6L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("aaaa");
		int count =mapper.update(board);
		log.info(count);
	}
	//페이징 레코드(리스트) 테스트 
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		//rnum이 30~40이 출력 된다.
		cri.setAmount(10);
		cri.setPageNum(4);
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board-> log.info(board));
	}
	//검색 테스트 
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		cri.setKeyword("금요일");
		cri.setType("TC");
		List<BoardVO> list = mapper.getListWithPaging(cri);
		log.info(list);
	}
	
	
//	//검색 테스트 (쿼리문이 제대로 작동하는지에 대한 테스트)
//	@Test
//	public void testSearch() {
//		//int bno = 10;
//		//List<BoardVO> list = mapper.searchTest(bno);
//		//log.info(list);
//		//키와 밸류가 전부 스트링인 맵 타입 
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("T", "금요일");
//		map.put("C", "CCCC");
//		//변수 생성 해서 아우터에 map의key값을 전달 를 통해서 전달 한다.
//		Map<String, Map<String, String>> outer = new HashMap<String, Map<String,String>>();
//		outer.put("map", map);
//		List<BoardVO> list = mapper.searchTest(outer);
//		log.info(list);
//	}
}

















