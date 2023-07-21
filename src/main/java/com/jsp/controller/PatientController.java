package com.jsp.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PatientController{

	@RequestMapping("add")
	public void addition(HttpServletRequest request,HttpServletResponse response) throws IOException{
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		response.getWriter().print("<h1> The Sum of "+num1+ " and "+ num2 + " is " + (num1+num2)+"</h1>" );
	
	}
	@RequestMapping("sub")
	public String sub(@RequestParam int num1,@RequestParam int num2){
		return "<h1>The difference of"+num1+"and"+"num2"+(num1-num2)+"</h1>";
	}
	@RequestMapping("mul")
	public String mul(@RequestParam int num1,@RequestParam int num2, ModelMap map){//Model and View  view
		int result=num1*num2;
		map.put("operation", "product");
		map.put("num1", num1);
		map.put("num2", num2);
		map.put("result", result);
		return "result.jsp";
	}
//	@RequestMapping("div")
//	public String div(@RequestParam double num1,@RequestParam int num2, ModelMap map){//Model and View  view
//		double result=num1/num2;
//		map.put("operation", "division");
//		map.put("num1", num1);
//		map.put("num2", num2);
//		map.put("result", result);
//		return "result.jsp";
//	}
	@RequestMapping("div")
	public ModelAndView div(@RequestParam double num1,@RequestParam int num2, ModelAndView map){//Model and View  view
		double result=num1/num2;
		if(result%2==0){
			map.addObject("even",result);
		}else{
			map.addObject("odd",result);
		}
			map.setViewName("result.jsp");
		map.addObject("operation", "division");
		map.addObject("num1", num1);
		map.addObject("num2", num2);
		map.addObject("result", result);
		return map;
	}
	
	
}
