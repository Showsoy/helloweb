package com.legacy.helloweb;

import java.util.List;
import org.springframework.stereotype.Controller;
import javax.inject.Inject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.legacy.helloweb.SERVICE.TestService;
import com.legacy.helloweb.VO.TestVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Inject
	TestService service;
	
	@RequestMapping(value = "/")
	public String home(Model model) throws Exception{
		List<TestVo> list;		
		list = service.test();	            //TestService의 test()메서드 실행
		model.addAttribute("list",list);	//model에 담아서
		
		return "main/home";
	}
	
}
