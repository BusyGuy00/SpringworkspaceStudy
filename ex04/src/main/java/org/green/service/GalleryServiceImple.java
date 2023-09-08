package org.green.service;

import java.util.List;

import org.green.domain.GalleryBoardVO;
import org.green.mapper.GalleryBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class GalleryServiceImple implements GalleryService {
	@Setter(onMethod_= {@Autowired} )
	private GalleryBoardMapper mapper;

	//등록
	@Override
	public void register(GalleryBoardVO gvo) {
		mapper.insert(gvo);
	}
	//1개만 조회
	@Override
	public GalleryBoardVO get(int gno) {
		GalleryBoardVO gvo = mapper.read(gno);
		return gvo;
	}
	//업데이트
	@Override
	public boolean modify(GalleryBoardVO gvo) {
		return mapper.update(gvo) == 1;
	}

	@Override
	public boolean remove(int bno) {
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<GalleryBoardVO> getList() {
		List<GalleryBoardVO> gallerylist = mapper.getList();
		return gallerylist;
	}

}
