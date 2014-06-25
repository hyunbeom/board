package org.h4c.service;

import java.util.List;

import org.h4c.vo.BoardVO;
import org.h4c.vo.WebCriteria;

public interface BoardService {

	public void regist(BoardVO vo)throws RuntimeException;
	
	public BoardVO get(int bno)throws RuntimeException;
	
	public void modify(BoardVO vo)throws RuntimeException;
	
	public void remove(int bno)throws RuntimeException;
	
	public List<BoardVO> find(WebCriteria cri)throws RuntimeException;
	
}
