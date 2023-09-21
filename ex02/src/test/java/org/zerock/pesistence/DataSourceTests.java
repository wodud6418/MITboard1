package org.zerock.pesistence;

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


import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) //junit으로 테스트할때 스프링프레임워크를 이용해서 해라
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")//스프링프레임워크 설정 파일 위치
@Log4j
public class DataSourceTests {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnection() throws SQLException {
		dataSource.getConnection();
	}
	
	@Test
	public void testMyBatis() {
		SqlSession session=sqlSessionFactory.openSession();
		session.getConnection();
	}
	
}





