package com.test.test1.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	List<ExcelVo> list = new ArrayList<>();
	MainApp mainApp = new MainApp();

	@RequestMapping("/")
	public ModelAndView Main(ModelAndView mv) {
		mv.addObject("list", mainApp.excelRead());
		mv.setViewName("testxml");
		return mv;
	}
	
	@RequestMapping(value="create_data", method=RequestMethod.POST)
	@ResponseBody
	public void create(ExcelVo vo) {
		addList(vo);
	}
	
	public void addList(ExcelVo vo) {
		list.add(vo);
	}
	
	@RequestMapping("sendWrite")
	@ResponseBody
	public void sendWrite() {
		mainApp.excelWrite(list);
	}
}
