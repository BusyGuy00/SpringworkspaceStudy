package org.green.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import org.springframework.web.context.WebApplicationContext;


import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//Servlet의 ServletContext를 이용하기 위하여 설정 
@WebAppConfiguration
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
	})
@Log4j
public class BoardControllerTests {
	@Setter (onMethod_= {@Autowired} )
	private WebApplicationContext ctx;
	//가짜 Mvc url과 파라미터 등을 브라우저에서 사용하는 것 처럼 만들어서 
	//컨트롤러를 실행해 볼 수 있다.
	//MockMvcRequestBuilders를 사용해 get 전송을 테스트 할 수 있다.
	private MockMvc mockMvc;
	
	//모든 테스트 전에 매번 실행 되는 메소드로 지정 
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	//목록보기 테스트 
	@Test
	public void testList() throws Exception {
		log.info(
				//get방식 전송 
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
		);	
		}
	//게시글 등록 테스트
	@Test
	public void testRegister() throws Exception {
		String resultPage = 
				mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
				.param("title", "금요일제목")
				.param("content", "금요일내용")
				.param("writer", "금금금")
				).andReturn().getModelAndView().getViewName();
		log.info(resultPage);
	}
	
	//게시글 1개 조회 테스트 
	@Test
	public void testGet() throws Exception {
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
				.param("bno", "4"))
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	//게시글 수정 테스트
	@Test
	public void testModify() throws Exception {
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
				.param("bno", "6")
				.param("title", "금요일수정제목")
				.param("content", "금요일 수정 내용")
				.param("writer", "그린"))
				.andReturn()
				.getModelAndView()
				.getViewName();
				log.info(resultPage);
	}
	//삭제테스트
	@Test
	public void testRemove() throws Exception {
		String resultPage = mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
				.param("bno", "4"))
				.andReturn()
				.getModelAndView()
				.getViewName();
				log.info(resultPage);
	}
}
















