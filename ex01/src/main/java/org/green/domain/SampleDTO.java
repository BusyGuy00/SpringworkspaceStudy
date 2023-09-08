package org.green.domain;

import lombok.Data;


@Data //직접적인 선언 없이도 자동으로 만들어 진다.
//http://localhost:8060/sample/ex02?name=green&age=20 이렇게 검색하면 값을 받을 수있는 것을 확인 할 수 있다.
public class SampleDTO {
	private String name;
	private int age;
	
}
