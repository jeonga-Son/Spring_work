package kosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosa.service.HelloService;

@Controller // controller 자동 생성되도록
public class HelloController {
	@Autowired
	private HelloService service;
	
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", service.getMessage());
		mav.setViewName("hello");
	
		return mav;
	}
	
	@RequestMapping("/hello2.do")
	public String hello2(Model model) {
		model.addAttribute("message", "파이팅");
		
		return "hello";
	}
	
}
