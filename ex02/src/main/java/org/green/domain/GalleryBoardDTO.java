package org.green.domain;

import java.util.List;

import lombok.Data;

@Data
public class GalleryBoardDTO {
	private Long gno;
	private String title;
	private String writer;
	private String filename;
	private String uploadpath;
	private String category;
	private String content;
	
	private List<GalleryBoardDTO> BoardList;
}
