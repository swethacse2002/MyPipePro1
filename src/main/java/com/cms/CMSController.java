package com.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.carz;
import com.cms.dao.carzDAO;




@Controller
public class CMSController {
	
	@Autowired
	carzDAO dao; 
	
	


@RequestMapping("Register")
public ModelAndView loadRegister() {
	ModelAndView mv=new ModelAndView("Register");
			return mv;
}
@RequestMapping("PerformInsert")
public ModelAndView PerformRegister(@ModelAttribute("bean") carz bean) {
	dao.Register(bean);
	ModelAndView mv = new ModelAndView("RegisterSuccess");
	mv.addObject("bean", bean);
	return mv;
}

}
