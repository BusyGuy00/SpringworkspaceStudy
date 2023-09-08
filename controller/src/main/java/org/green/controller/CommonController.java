package org.green.controller;

import org.green.domain.AuthVO;
import org.green.domain.MemberVO;
import org.green.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class CommonController {
	@Setter(onMethod_= {@Autowired} )
	private MemberService service;
	
	@GetMapping("register_member")
	public void registerMember() {
		
	}
	@PostMapping("register_member")
	public String registerMember(MemberVO mvo, AuthVO avo, RedirectAttributes rttr) {
		log.info("=======================================");
		log.info("mvo : " + mvo);
		log.info("=======================================");
		log.info("avo : " + avo);
		log.info("=======================================");
		rttr.addAttribute("result","등록");
		service.register(mvo, avo);
		return "redirect:/board/list";
	}
	
	
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		log.info("접근 거부 : " + auth);
		model.addAttribute("msg" , "접근 거부");
	}
	@GetMapping("/customLogin")
	public void ioginInput(String error, String logout, Model model) {
		log.info("에러 : " + error);
		log.info("로그아웃 : " + logout);
		
		//값이 있을 경우 
		if(error != null) {
			model.addAttribute("error","로그인오류");
		}
		if(logout != null) {
			model.addAttribute("logout","로그아웃~!");
		}		
	}
	@GetMapping("/customLogout")
	public void logoutGet() {
		log.info("로그아웃");
	}
}
	