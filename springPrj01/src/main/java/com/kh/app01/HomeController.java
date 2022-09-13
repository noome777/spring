package com.kh.app01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
//	@Autowired
	private HomeService s;
	
	
//	@Autowired
//	public HomeController (HomeService x) {
//		System.out.println("홈 컨트롤러 객체 태어남");
//		this.s = x;
//	}
	
	@Autowired
	public void setS(HomeService s) {
		System.out.println("컨트롤러의 setter 호출됨");
		this.s = s;
		System.out.println(s);
	}


	@RequestMapping("/")
	public String home() {
		
		System.out.println("controller 호출됨");
		int result = s.home();
		
		return "home";
	}
	
}
