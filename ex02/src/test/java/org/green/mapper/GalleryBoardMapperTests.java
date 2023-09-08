//package org.green.mapper;
//
//import java.util.List;
//
//import org.green.domain.BoardVO;
//import org.green.domain.Criteria;
//import org.green.domain.GalleryBoardDTO;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import lombok.Setter;
//import lombok.extern.log4j.Log4j;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j
//public class GalleryBoardMapperTests {
//	@Setter(onMethod_= {@Autowired} )
//	private GalleryBoardMapper mapper;
//	@Test
//	public void testGetList() {
//		//데이터들을 리스트(배열)로 받아서 forEach를 통해서 출력 시킨다.
//		mapper.getlist().forEach(board -> log.info(board));
//	};
//	//Insert처리 테스트 
//		@Test
//		public void testInsert() {
//			GalleryBoardDTO board = new GalleryBoardDTO();
//			board.setTitle("새로작성하는 제목1");
//			board.setWriter("새로작성하는 작가1");
//			board.setFilename("새로작성하는 이름1");
//			board.setUploadpath("green1");
//			board.setCategory("카테고리1");
//			board.setContent("콘텐트1");
//			mapper.insert(board);
//			log.info(board);
//		};
//		//select처리 테스트 
//		@Test
//		public void testRead() {
//			GalleryBoardDTO board = mapper.read(1L);
//			log.info(board);
//		};
//		//delete 처리 테스트 
//		@Test
//		public void testDelete() {
//			log.info("Delete count : " + mapper.delete(3L));
//		};
//		//update 테스트 
//		@Test
//		public void testUpdate() {
//			GalleryBoardDTO board = new GalleryBoardDTO();
//			board.setGno(2L);
//			board.setTitle("수정작성하는 제목1");
//			board.setWriter("수정작성하는 작가1");
//			board.setFilename("수정작성하는 이름1");
//			board.setUploadpath("green1");
//			board.setCategory("카테고리1");
//			board.setContent("콘텐트1");
//			int count =mapper.update(board);
//			log.info(count);
//		};
//		//페이징 레코드(리스트) 테스트 
//		@Test
//		public void testPaging() {
//			Criteria cri = new Criteria();
//
//			cri.setAmount(10);
//			cri.setPageNum(1);
//			List<GalleryBoardDTO> list = mapper.getGalleryListPaging(cri);
//			list.forEach(board-> log.info(board));
//		}
//		@Test
//		public void testSearch() {
//			Criteria cri = new Criteria();
//			cri.setKeyword("수정");
//			cri.setType("TC");
//			List<GalleryBoardDTO> list = mapper.getGalleryListPaging(cri);
//			log.info(list);
//		}
//}
