package com.kh.app01.board;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping(value = "/board")//공통 url
@RequestMapping("/board")//공통 url
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	
	@RequestMapping(value = "/write" ,method = RequestMethod.POST)
	public String write(
//			HttpServletRequest req, 
			BoardVo vo) {
		System.out.println("board 컨트롤러 호출됨");
		
//		String title = req.getParameter("title");
//		String content = req.getParameter("content");
//		System.out.println("title : " + title);
//		System.out.println("content : " + content);
		
//		BoardVo vo = new BoardVo();
//		vo.setTitle(title);
//		vo.setContent(content);
		System.out.println(vo);
		
		int result = service.write();
		return "board/write";
	}

}
