package com.xu.controller;

import com.alibaba.fastjson.JSONArray;
import com.xu.dao.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class MvcController {

	@RequestMapping(value = "/test",method = RequestMethod.GET, params = "hello")
	public ModelAndView test1(String hello){
		ModelAndView mv = new ModelAndView();

		mv.addObject("hello","hello MVC");
		mv.setViewName("test");

		return mv;
	}

	@RequestMapping(value = "/json")
	@ResponseBody
	public ModelAndView Json(@Validated @Param("User") User user, BindingResult br){

		List<ObjectError> allErrors = br.getAllErrors();	// 获取所有错误
		for (ObjectError allError : allErrors) {
			System.out.println(allError.getObjectName());
			System.out.println(allError.getCode());

			if (allErrors.size() > 0){
				return null;
			}
		}

		ModelAndView mv = new ModelAndView();
		mv.addObject("usera","小怜");
		mv.setViewName("test");

		return mv;

//		return JSONArray.toJSONString();

	}

}
