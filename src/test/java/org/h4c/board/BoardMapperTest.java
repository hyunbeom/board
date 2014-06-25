package org.h4c.board;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.h4c.mapper.BoardMapper;
import org.h4c.service.BoardService;
import org.h4c.vo.BoardVO;
import org.h4c.vo.WebCriteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/**/*-context.xml"})
public class BoardMapperTest {
	
	private static final Logger logger = Logger.getLogger(BoardMapperTest.class);

	@Inject
	BoardService service;
	
//	@Test
//	public void testCreate(){
//		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("샘플");
//		vo.setContent("샘플");
//		vo.setWriter("1111");
//		
//		service.regist(vo);
//		
//		
//	}
	

	
//	@Test
//	public void readTest(){
//		System.out.println(mapper.read(2));
//	}
	
//	@Test
//	public void getListTest1(){
//		String[] arr = {"123","123"};
//		WebCriteria cri = new WebCriteria();
//		cri.setKeyword("a");
//		cri.setPageno(2);
//		cri.setTypes(arr);
//		
//		logger.info(service.find(cri));
//		
//	}
	
//	@Test
//	public void removeTest(){
//		int bno = 98290;
//		service.remove(bno);
//		
//	}
	
//	@Test
//	public void readTest(){
//		int bno = 98291;
//		service.get(bno);
//		logger.info(service.get(bno));
//	}
//	
//	@Test
//	public void updateTest(){
//		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("샘플");
//		vo.setContent("샘플");
//		vo.setBno(98291);
//		
//		service.modify(vo);
//
//	}
	
	
}
