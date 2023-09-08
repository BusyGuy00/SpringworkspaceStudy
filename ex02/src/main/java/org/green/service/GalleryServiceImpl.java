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
public class GalleryServiceImpl implements GalleryService {

	@Setter(onMethod_= {@Autowired} )
	private GalleryBoardMapper gallerymapper;
	@Override
	public void register(GalleryBoardVO gvo) {
		gallerymapper.insert(gvo);
		
	}

	@Override
	public GalleryBoardVO get(int gno) {
		GalleryBoardVO gvo = gallerymapper.read(gno);
		return gvo;
	}

	@Override
	public boolean modify(GalleryBoardVO gvo) {
		
		return gallerymapper.update(gvo) == 1;
	}

	@Override
	public boolean remove(int bno) {
		return gallerymapper.delete(bno) == 1;
	}

	@Override
	public List<GalleryBoardVO> getList() {
		List<GalleryBoardVO> galleryList = gallerymapper.getList();
		return galleryList;
	}

}
