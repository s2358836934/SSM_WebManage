package com.ssm.webmanage.controller;

import com.ssm.webmanage.domain.TWebsiteType;
import com.ssm.webmanage.service.WebTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class WebTypeController { //操作网页类型的

    @Autowired
    private WebTypeService wts;

    @RequestMapping("/webType.do")
    public ModelAndView showWebType(){
        ModelAndView mv = new ModelAndView();
        List<TWebsiteType> websiteTypeList =  wts.showWebType();
        mv.addObject("websiteTypeList",websiteTypeList);
        mv.setViewName("showWebType");
        return mv;
    }
}
