package org.green.controller;

import java.util.List;

import org.green.domain.MemberDTO2;
import org.green.service.MemberService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member2/*")
public class MemberController2 {
	@Setter(onMethod_= {@Autowired} )
	private MemberService2 service;
	//목록
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list",service.getList());
	}
	
	//등록
	@GetMapping("/register")
	public void register() {
		
	}
	@PostMapping("/register")
	public String register(MemberDTO2 mto) {
		log.info("+++++++++++++++++++++++++++++++++++++++");
		log.info("등록 : " + mto);
		log.info("+++++++++++++++++++++++++++++++++++++++");
		service.register(mto);
	return "redirect:/member2/list";
	}
	
}
