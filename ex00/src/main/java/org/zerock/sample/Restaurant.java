package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
//ToString을 통해 문자열 타입으로 @Autowired 메소드가 작동 하는지 확인이 가능해 진다. 
@ToString
//@AllArgsConstructor // 생성자 주입
@RequiredArgsConstructor // final을 이용한 자동 주입
public class Restaurant {
	//의존성 주입 (필드 주입)
	//@Autowired //이것을 안해주면 값을 받아 올 수 없어 null이 뜬다.
	//private Chef chef;	//=> Chef= new Chef() 의존성 주입을 함으로써 생략이 가능 하다.
	
	//세터 주입
	//@Setter(onMethod_ = {@Autowired} )
	//private Chef chef;
	
	//@AllArgsConstructor을 할경우 따로 의존성 주입이나 세터 주입이 필요 없이 가능하다. 
	//private Chef chef;
	
	private final Chef chef;
}
