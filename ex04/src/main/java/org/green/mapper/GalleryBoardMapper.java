package org.green.mapper;

import java.util.List;

import org.green.domain.GalleryBoardVO;

public interface GalleryBoardMapper {
	//게시글
	public List<GalleryBoardVO> getList();
	//등록
	public void insert(GalleryBoardVO gvo);
	//조회
	public GalleryBoardVO read(int gno);
	//삭제 
	public int delete (int gno);
	//수정 
	public int update (GalleryBoardVO gvo);
	
	
}
