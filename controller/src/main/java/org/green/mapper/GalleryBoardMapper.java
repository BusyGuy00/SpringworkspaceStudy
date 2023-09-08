package org.green.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.green.domain.Criteria;
import org.green.domain.GalleryBoardDTO;
import org.green.domain.GalleryBoardVO;

public interface GalleryBoardMapper {
	//추상메소드
	//@Select("Select * from tbl_gallery where gno > 0")
	public List<GalleryBoardVO> getList();
	
	//create문
	public void insert (GalleryBoardVO gvo);
	//select문
	public GalleryBoardVO read(int gno);
	//delete문 
	public int delete(int gno);
	//update문
	public int update(GalleryBoardVO gvo);
	
	
	//페이징 처리 
	//public List<GalleryBoardDTO> getGalleryListPaging(Criteria cri);
	//전체 데이터 개수 
	//public int getGalleryTotalCount(Criteria cri);
	//insert메소드2 등록된 번호 받기 
	//public void GalleryInsertSelect(GalleryBoardDTO gdto);
	//검색 연습 
	//Map<키: 스트링타입, 값: map타입>
	//public List<GalleryBoardDTO> GallerySearch(Map<String, Map<String,String>> map);

	
	
}

