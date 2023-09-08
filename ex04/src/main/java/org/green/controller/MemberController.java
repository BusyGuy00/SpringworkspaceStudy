package org.green.controller;

import org.green.domain.MemberDTO;
import org.green.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member/*")
@AllArgsConstructor
public class MemberController {
	@Setter(onMethod_= {@Autowired} )
	private MemberService memberservice; 
	
	@GetMapping("/list")
	public void list (Model model) {
		model.addAttribute("list", memberservice.getMemberList());
	}
	@GetMapping("/register")
	public void register() {
	}
	@PostMapping("/register")
	public String postregister( MemberDTO mdto, RedirectAttributes rttr) {
		log.info("==================================================");
		log.info("register : " + mdto);
		log.info("==================================================");
		memberservice.register(mdto);
		rttr.addAttribute("result",mdto.getMno());
		return "redirect:/member/list";
	}
	
}
