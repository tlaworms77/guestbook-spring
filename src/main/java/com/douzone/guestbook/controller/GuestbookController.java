package com.douzone.guestbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestBookDao guestbookDao;
	
	@RequestMapping({"", "index"})
	public String index(Model model) {
		model.addAttribute("list", guestbookDao.getList());
		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping("deleteform/{no}")
	public String deleteform( Model model,
		@PathVariable("no") Long no) {
		
		model.addAttribute("no", no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping("delete")
	public String delete(GuestBookVo vo) {
		guestbookDao.delete(vo);
		return "redirect:/";
	}
	
	@RequestMapping("add")
	public String add(GuestBookVo vo) {
		guestbookDao.insert(vo);
		return "redirect:/";
	}
	
}
