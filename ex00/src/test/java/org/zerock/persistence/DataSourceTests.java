package org.zerock.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.SampleTests;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//히카리 CP를 확인 하는 클래스 

//스프링 로드 될때 마다 작동 하겠다. 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	@Setter(onMethod_= {@Autowired})
	private DataSource ds;
	@Setter(onMethod_= {@Autowired})
	private SqlSessionFactory SqlSessionFactory;
	@Test
	public void testConnection() {
		try {
			Connection con = ds.getConnection();
			log.info(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testMybatis() {
		SqlSession session = SqlSessionFactory.openSession();
		Connection con = session.getConnection();
		log.info(session);
		log.info(con);
	}
}
	










