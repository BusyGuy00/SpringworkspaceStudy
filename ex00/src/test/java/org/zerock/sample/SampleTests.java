package org.zerock.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

//스프링 로드 될때 마다 작동 하겠다. 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleTests {
	@Autowired //자동으로 주입 시키는 메소드 
	private Restaurant restaurant;
	
	@Test
	public void test1() {
		System.out.println("test1");
		log.info("test1.......");
		//@Autowired 메소드를 통해 자동으로 주입이 되는지 확인이 가능하다  받아 오는 값들에 @Date나 @toString을 넣어 줘야 한다.
		log.info(restaurant);
	}
}
