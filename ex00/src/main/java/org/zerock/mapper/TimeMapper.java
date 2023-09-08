package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//SQL 추가 해준 것이다.  어노테이션으로 걸어주는 방식
	@Select("Select sysdate from dual")
	public String getTime();
	//xml을 통해 사용하는 방식 
	public String getTime2();
}
