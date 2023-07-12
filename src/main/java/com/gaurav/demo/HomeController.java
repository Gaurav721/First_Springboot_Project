package com.gaurav.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	
	 @RequestMapping("home")
	 
	 public ModelAndView home(Players players)
	 {
		 ModelAndView mv = new ModelAndView();
		 mv.addObject("obj" , players);
		 return mv;
	 }
//	 public ModelAndView home(@RequestParam("name") String myName) 
//	 {
//    	 ModelAndView mv = new ModelAndView();
//    	 mv.addObject("name",myName);
//    	 mv.setViewName("home");
//    	 return mv;
//     }
//     public String home(HttpServletRequest req) 
//	 {
//		 HttpSession session = req.getSession();
//		 String name = req.getParameter("name");
//    	 System.out.println("hi " + name);
//    	 session.setAttribute("name", name);
//    	 return "home";
//     }
}
