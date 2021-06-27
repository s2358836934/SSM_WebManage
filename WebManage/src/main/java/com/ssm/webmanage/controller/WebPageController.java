package com.ssm.webmanage.controller;


import com.ssm.webmanage.domain.PageBean;
import com.ssm.webmanage.domain.WebList;
import com.ssm.webmanage.service.PageBeanService;
import com.ssm.webmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class WebPageController {

    @Autowired
    private PageBeanService pbs;

    @Autowired
    private UserService us;




    //首页
    @RequestMapping("/firstPage.do")
    public ModelAndView firstPage(){
        return assist(1,5);
    }

    //上一页
    @RequestMapping("/previousPage.do")
    public ModelAndView previousPage(@RequestParam(name = "currentPage") String currentPage){
        ModelAndView mv = new ModelAndView();
        if(currentPage.equals("1")){ //当前页面为1的时候 直接跳转到首页
            mv.setViewName("forward:firstPage.do");
            return mv;
        }
        Integer newCurrentPage = Integer.parseInt(currentPage) - 1; //页面数-1
        return assist(newCurrentPage,5);
    }

    //下一页
    @RequestMapping("/nextPage.do")
    public ModelAndView nextPage(@RequestParam(name = "totalPage") String totalPage,@RequestParam(name = "currentPage") String currentPage){
        ModelAndView mv = new ModelAndView();
        if(totalPage.equals(currentPage)){
            mv.setViewName("forward:lastPage.do");
            return mv;
        }
        Integer newCurrentPage = Integer.parseInt(currentPage)+1;
        return assist(newCurrentPage,5);
    }

    //尾页
    @RequestMapping("/lastPage.do")
    public ModelAndView lastPage(@RequestParam(name = "totalPage") String totalPage){
        Integer newCurrentPage = Integer.parseInt(totalPage); //这里是因为当 当前页面为最后一页的才会到尾页
        return assist(newCurrentPage,5);
    }

    //因为代码冗余 这里应该是可以做一个辅助方法的
    public ModelAndView assist(Integer pageNumber,Integer pageSize){
        ModelAndView mv = new ModelAndView();
        PageBean pb = pbs.getPageBean(pageNumber,5);
        ArrayList<WebList> webLists = (ArrayList<WebList>) us.showWeb(pb);
        mv.addObject("webLists",webLists);
        mv.addObject("pages",pb);
        mv.setViewName("WebsiteList");
        return mv;
    }

}
