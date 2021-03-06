package org.h4c.board;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.h4c.service.BoardService;
import org.h4c.vo.BoardVO;
import org.h4c.vo.WebCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	BoardService service;

	private static final Logger logger = Logger
			.getLogger(BoardController.class);

	@RequestMapping("/")
	public String index() {
		return "redirect:list";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(Model model, WebCriteria cri) {
		logger.info(cri);
		
		
		if (cri.getPageno() == 0) {
			cri.setPageno(1);
		}
		

		List<BoardVO> list = new ArrayList<BoardVO>();
		list = service.find(cri);
		logger.info("==========================");
		logger.info(list);
		logger.info("==========================");
		
		
		model.addAttribute("boardList",list);
		model.addAttribute("totalCnt", list.get(0).getTotalCnt());
		logger.info(model.toString());
		

	

<<<<<<< HEAD
=======
		model.addAttribute("boardList", list);
		model.addAttribute("criteria", cri);
		model.addAttribute("totalCnt", list.get(0).getTotalCnt());
>>>>>>> FETCH_HEAD

	}

	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public void detail(Model model, BoardVO vo,WebCriteria cri) {

		logger.info("==========================");

		logger.info("==========================");

		model.addAttribute("vo", service.get(vo.getBno()));
		model.addAttribute("criteria",cri);
	}

	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public void modify(Model model, BoardVO vo,WebCriteria cri) {
		if (cri.getPageno() == 0) {
			cri.setPageno(1);
		}
		
		model.addAttribute("vo", service.get(vo.getBno()));
		model.addAttribute("criteria",cri);
		logger.info("===========================");
		logger.info(cri);
		logger.info("===========================");
		logger.info("===========================");
	}

	@RequestMapping(value = "modifyAction", method = RequestMethod.POST)
	public String modifyAction(Model model,BoardVO vo,WebCriteria cri) {
		
		logger.info("===========================");
		logger.info(vo.getBno());
		logger.info(vo.getTitle());
		logger.info("===========================");
		service.modify(vo);
<<<<<<< HEAD
		model.addAttribute("nextPage","detail");
		
		return "board/result";
=======
<<<<<<< HEAD
		return "redirect:detail?bno="+vo.getBno();
		
	}
	

	@RequestMapping(value = "regist", method = RequestMethod.GET)
	public void regist(BoardVO vo){		
		logger.info("123");
		
=======
		return "redirect:detail?bno=" + vo.getBno();
>>>>>>> FETCH_HEAD

>>>>>>> origin/master
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public void create(Model model, BoardVO vo) {

	}

	@RequestMapping(value = "createAction", method = RequestMethod.POST)
	public String createAction(BoardVO vo) {
		logger.info("===============123============");
		logger.info(vo);
		logger.info("===============123============");
		service.regist(vo);
		return "redirect:list";
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete(int bno) {
		service.remove(bno);
		
		return "redirect:list";
	}

}
