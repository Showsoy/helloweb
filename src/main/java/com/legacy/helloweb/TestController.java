package com.legacy.helloweb;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.legacy.helloweb.SERVICE.TestService;
import com.legacy.helloweb.VO.TestVo;

@Controller
public class TestController {
	
	@Inject
    //컨트롤러가 사용할 서비스를 Inect시킨다
	TestService service;

	@RequestMapping(value="/",method = RequestMethod.GET)
    //value : 주소창 요청경로, method : 요청방식(GET방식)
	public String test(Model model) throws Exception {
		List<TestVo> list;		
		list = service.test();	            //TestService의 test()메서드 실행
		model.addAttribute("list",list);	//model에 담아서
		return "main/test";                      //test.jsp로
	}
}
