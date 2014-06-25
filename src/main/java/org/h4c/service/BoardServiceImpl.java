package org.h4c.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.h4c.mapper.BoardMapper;
import org.h4c.vo.BoardVO;
import org.h4c.vo.WebCriteria;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Inject
	BoardMapper mapper;
	
	@Override
	public void regist(BoardVO vo) throws RuntimeException {
		// TODO Auto-generated method stub
		mapper.create(vo);
	}

	@Override
	public BoardVO get(int bno) throws RuntimeException {
		// TODO Auto-generated method stub
		return mapper.read(bno);
	}

	@Override
	public void modify(BoardVO vo) throws RuntimeException {
		// TODO Auto-generated method stub
		mapper.update(vo);
	}

	@Override
	public void remove(int bno) throws RuntimeException {
		// TODO Auto-generated method stub
		mapper.delete(bno);
	}

	@Override
	public List<BoardVO> find(WebCriteria cri) throws RuntimeException {
		
		
		return mapper.getList(cri);
	}

}
