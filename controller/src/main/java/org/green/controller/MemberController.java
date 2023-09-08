package org.green.controller;

import org.green.domain.AuthVO;
import org.green.domain.MemberVO;
import org.green.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
// 받아온 데이터를 가공해서 이동,반환  
@Log4j
@AllArgsConstructor
@Controller
@RequestMapping("/member/*")
public class MemberController {
	@Setter(onMethod_= {@Autowired} )
	private MemberService Service;	
	@Setter(onMethod_= {@Autowired} )
	private PasswordEncoder pwencoder;
	
	
	@GetMapping("/register_member")
	public void register() {
	}
	@PostMapping("/register_member")
	public String postregister ( MemberVO mvo, AuthVO avo, RedirectAttributes rttr ) {
		mvo.setUserpw(pwencoder.encode(mvo.getUserpw()));
		Service.register(mvo, avo);
		return "redirect:/member/list";
	}
}
