package com.daniel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {	
		
		String a = request.getParameter("user");
		String b = request.getParameter("pass");
		String k= a+" "+b;		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",k);
		mv.setViewName("display.jsp");
		return mv;
	}
}
