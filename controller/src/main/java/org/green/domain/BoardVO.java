package org.green.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;


//서블릿에서의 DTO 역할
@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String Writer;
	private Date regdate;
	private Date updatedate;
	private String rnum;
	
	private List<BoardAttachVO> attachList;
}
