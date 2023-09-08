package org.green.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//어노테이션으로도 사용 가능하고 xml로도 사용 가능하다 src/main/resources에 폴더를 만들어 준다.
	//org 폴더 생성 안에 green안에 mapper 대응하는 패키지의 이름과 같게 폴더 경로를 만들어 주면 된다
	//@Select("Select sysdate from dual")
	@Select("Select * from tbl_board")
	public String getTime();
	public String getTime2();
}



