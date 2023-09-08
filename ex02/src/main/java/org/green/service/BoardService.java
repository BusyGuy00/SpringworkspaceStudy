package org.green.service;

import java.util.List;

import org.green.domain.BoardAttachVO;
import org.green.domain.BoardVO;
import org.green.domain.Criteria;
import org.green.mapper.BoardAttachMapper;
	
//비즈니스 로직 생성
public interface BoardService {
	//등록 insert
	public void register (BoardVO board);
	//게시글 1개 조회 select
	public BoardVO get(Long bno);
	//수정하기
	public boolean modify(BoardVO board);
	//삭제하기
	public boolean remove(Long bno);
	//게시글 목록 조회 
	//BoardMapper에서 만든 Criteria cri를 넣어 주고 구현 하는 Impl에 넣어 준다. 
	public List<BoardVO> getList(Criteria cri);
	//게시글 개수 조회  //Criteria cri 검색후의 데이터 개수 처리를 위해 추가 
	public int getTotal(Criteria cri); 
	//게시글 번호에 맞는 BoardAttachVO list 받기
	public List<BoardAttachVO> getAttachList(Long bno);
}
