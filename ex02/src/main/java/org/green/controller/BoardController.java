package org.green.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.green.domain.BoardAttachVO;
import org.green.domain.BoardVO;
import org.green.domain.Criteria;
import org.green.domain.PageDTO;
import org.green.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("board/*")
//BoardController 불려질때 BoardService를 사용 하기 위해 의존성 주입을 한다
@AllArgsConstructor
public class BoardController {
	private BoardService service; 
	
	@GetMapping ("/list2")
	public void list2(Criteria cri,Model model) {
		//service의 객체를  Model에 담아 사용한다.
				model.addAttribute("list",service.getList(cri));
				
	}
	
	//게시글 리스트 list?pageNum=1&amount=10 이라는 값이 필요 할때 파라미터로 호출
	@GetMapping("/list")
	public void list(Criteria cri,Model model) {
		//service의 객체를  Model에 담아 사용한다.
		model.addAttribute("list",service.getList(cri));
		//전체 게시글 수 받아오기 
		int total = service.getTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	
	//게시글 등록 하기 위해 register.jsp로 보내기 위한 getmapping
	@GetMapping("/register")
	public void register() {
	}
	//게시글 등록 
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		//RedirectAttributes
		//등록작업이 끝난 후 다시 목록화면으로 이동하기 위함 
		//추가적으로 새롭게 등록한 게시물의 번호를 같이 전달하기 위해 사용 
		log.info("==================================================");
		log.info("register : " + board);
		log.info("==================================================");
		service.register(board);
		rttr.addAttribute("result",board.getBno());
		//rttr.addAttribute("result","등록");
		return "redirect:/board/list";
	}
	//게시글 1개 조회 
	//{"/get","/modify"} {}를 이용해서 여러개의 값을 줄 수 있다.
	
//	public void get(Long bno, Model model) {
//		log.info("get");
//		model.addAttribute("board",service.get(bno));
	//파라미터 이름과 변수가 다를때는 @RequestParam("bonno")으로 지정 해주면 된다.
	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("bno") Long bno,
			//수정후 원래 페지이로 넘어 오게 설정 
			@ModelAttribute("cri") Criteria cri, 
			Model model) {
		log.info("get");
		model.addAttribute("board",service.get(bno));
	}
	//수정 요청 
	@PostMapping("/modify")
	public String modify(BoardVO board, 
			//수정후 원래 페지이로 넘어 오게 설정 
			@ModelAttribute("cri") Criteria cri,
			RedirectAttributes rttr) {
		log.info("modify : " + board);
		if(service.modify(board)) {
			rttr.addAttribute("result","수정");
		}
		System.out.println("몇 페이지"+cri.getPageNum());
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		// get에서 페이징 처리를 넘겨 받기 위해 추가 
		rttr.addAttribute("keyword", cri.getKeyword());
		rttr.addAttribute("type", cri.getType());
		return "redirect:/board/list";
	}
	//삭제요청 처리 
	@PostMapping("/remove")
	public String remove(Long bno, RedirectAttributes rttr) {
		log.info("remove : " + bno);
		List<BoardAttachVO> attachList = service.getAttachList(bno);
		if (service.remove(bno)) {
			//파일 삭제 
			deleteFiles(attachList);
			rttr.addAttribute("result", "삭제");
		}
		return "redirect:/board/list";
	}
	//특정한 게시글 번호의 첨부파일과 관련된 데이터를 Json으로 반환하는 메소드 
	@GetMapping(value="/getAttachList", 
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody										// Long bno 받을 변수 형식을 넣어준다
	public ResponseEntity<List<BoardAttachVO>> getAttachList(Long bno){
		return new ResponseEntity<>(service.getAttachList(bno), HttpStatus.OK);
	}
	//파일 삭제 메소드 
	private void deleteFiles(List<BoardAttachVO> attachList) {
		if(attachList == null || attachList.size() == 0) {
			return;
		}
		attachList.forEach(attach->{
			Path file = Paths.get("C:\\upload\\" 
					+ attach.getUploadPath()+"\\"
					+attach.getUuid()+"_"+attach.getFileName());
				try {
					Files.deleteIfExists(file);
					//이미지 경우 썸네일 삭제  파일 뒤에 image로 시작하면 삭제 해라.
					if(Files.probeContentType(file).startsWith("image")) {
						Path thumbNail = Paths.get("C:\\upload\\" 
								+attach.getUploadPath()+"\\s_"
								+attach.getUuid()+"_"+attach.getFileName());
						Files.delete(thumbNail);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		});
	}
}


















