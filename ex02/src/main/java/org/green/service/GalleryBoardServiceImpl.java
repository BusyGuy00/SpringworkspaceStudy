//package org.green.service;
//
//import java.util.List;
//
//import org.green.domain.BoardAttachVO;
//import org.green.domain.BoardVO;
//import org.green.domain.Criteria;
//import org.green.domain.GalleryBoardDTO;
//import org.green.mapper.BoardAttachMapper;
//import org.green.mapper.BoardMapper;
//import org.green.mapper.GalleryBoardMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import lombok.AllArgsConstructor;
//import lombok.Setter;
//import lombok.extern.log4j.Log4j;
//
//@Log4j
//@Service
//@AllArgsConstructor
//public class GalleryBoardServiceImpl implements GalleryBoardService {
//
//	@Setter(onMethod_= {@Autowired})
//	private GalleryBoardMapper mapper;
//
//	@Override
//	public void galleryRegister(GalleryBoardDTO gboard) {
//		log.info("등록하기 : " + gboard);
//		//mapper.insert(board);
//		mapper.GalleryInsertSelect(gboard);
//		System.out.println("gno받아오기 : " + gboard.getGno());
//		log.info("bno받아오기 : " + gboard.getGno());
//		mapper.insert(gboard);
//	}
//
//	@Override
//	public GalleryBoardDTO galleryGet(Long gno) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean galleryModify(GalleryBoardDTO gboard) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean galleryRemove(Long gno) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<GalleryBoardDTO> getGalleryList(Criteria cri) {
//		log.info("리스트 출력");
//		return mapper.getGalleryListPaging(cri);
//	}
//
//	@Override
//	public int getGalleryTotal(Criteria cri) {
//		// TODO Auto-generated method stub
//		return mapper.getGalleryTotalCount(cri);
//	}
//
//	@Override
//	public List<GalleryBoardDTO> getGalleryList(Long bno) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
//}
