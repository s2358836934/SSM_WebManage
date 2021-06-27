package com.ssm.webmanage.controller;

import com.ssm.webmanage.domain.PageBean;
import com.ssm.webmanage.domain.TUser;
import com.ssm.webmanage.domain.TWebsiteType;
import com.ssm.webmanage.domain.WebList;
import com.ssm.webmanage.service.PageBeanService;
import com.ssm.webmanage.service.UserService;
import com.ssm.webmanage.service.WebListService;
import com.ssm.webmanage.service.WebTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private WebListService wls;


    @Autowired
    private UserService us;

    @Autowired
    private PageBeanService pbs;

    @Autowired
    private WebTypeService wts;

    //登录跳转
    @RequestMapping("/login.do")
    public ModelAndView login(@RequestParam(name = "userName") String userName,@RequestParam(name = "password") String password ){
        System.out.println(userName+password);
        ModelAndView mv = new ModelAndView();
        boolean b  = us.login(userName,password);
        if(b == true){
            mv.setViewName("choseWeb");
        }else{
            mv.setViewName("erro");
        }
        return mv;
    }

    //展示用户页面
    @RequestMapping("/showUserWeb.do")
    public ModelAndView showUserWeb(){
        ModelAndView mv = new ModelAndView();
        List<TUser> userList = us.showUserWeb();

        mv.addObject("userList",userList);
        mv.setViewName("showUserWeb");
        return mv;
    }


    //用户访问
    //访问的话 用户表 访问量+1
    @RequestMapping("/access.do")
    public ModelAndView access(@RequestParam(name="userName") String userName,@RequestParam(name="url") String url,@RequestParam(name="id") String id,@RequestParam(name="access_num")String accessNum){
        //首先查询出现有的访问量 然后+1返回去

        TUser user = us.selectUserAccess(userName);
        System.out.println("使用前"+user.getWebsite_access_num());
        user.setWebsite_access_num(user.getWebsite_access_num()+1);
        System.out.println("使用后"+user.getWebsite_access_num());
        us.userAccess(user);

        //还要增加weblist的


        //更新时间
        Integer newId = Integer.parseInt(id);
        Integer newAccessNum = Integer.parseInt(accessNum);
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());

        WebList wl = new WebList();
        wl.setId(newId);
        wl.setLast_access_date(ts);
        wl.setAccess_num(newAccessNum+1);
        wls.renewWeb(wl);
        System.out.println(url);
        return new ModelAndView(new RedirectView(url));
    }


//    PageBean pages = pbs.getPageBean(2,5);
//    ArrayList<WebList> webLists = (ArrayList<WebList>) us.showWeb(pages);
//            mv.addObject("webLists",webLists);
//            mv.addObject("pages",pages);
//            mv.setViewName("WebsiteList");
//    //修改学生信息
//    @RequestMapping("/updateWeb.do")
//    public ModelAndView updateWeb(@RequestParam("id") String id){
//        ModelAndView mv = new ModelAndView();
//        List<String> userList = us.selectTUser();
//        List<String> webSiteTypeList = us.selectWebSiteType();
//        mv.addObject("userList",userList);
//        mv.addObject("webSiteTypeList",webSiteTypeList);
//        mv.addObject("id",id);
//        mv.setViewName("updateWeb");
//
//        return mv;
//    }
//
//    @RequestMapping("/update.do")
//    public ModelAndView update(@RequestParam(name="wid") String wid,@RequestParam(name="wname") String wname,@RequestParam(name="wurl") String wurl,
//                               @RequestParam(name="websiteTypeSelect") String websiteType,@RequestParam(name="accessNum") String accessNum,@RequestParam(name="lastAccessDate") String lastAccessDate,
//                            @RequestParam(name="createDate") String createDate,@RequestParam(name="userSelect") String userName) throws ParseException {
//        ModelAndView mv = new ModelAndView();
//        System.out.println(wid+"=="+wname+"=="+wurl+"=="+websiteType+"=="+accessNum+"=="+lastAccessDate+"=="+createDate+"=="+userName);
//        if(wname==null||wname.equals("")||wurl==null||wurl.equals("")||websiteType==null||websiteType.equals("")||
//          accessNum==null||accessNum.equals("")||lastAccessDate==null||lastAccessDate.equals("")||createDate==null||
//          createDate.equals("")||userName==null||userName.equals("")){//判断内容是否为空
//            mv.setViewName("erro");
//            return mv;
//        }
//        Integer newWid = Integer.parseInt(wid);
//        Integer newAccessNum = Integer.parseInt(accessNum);
//        ArrayList<Timestamp> timestamps = this.transformTime(lastAccessDate,createDate);
//
//        //创建weblist对象
//        WebList webList = new WebList(newWid,wname,wurl,websiteType,newAccessNum,timestamps.get(0),timestamps.get(1),userName);
//        //执行update方法
//        us.updateWeb(webList);
//        mv.setViewName("success");
//        return mv;
//    }
//
    //新建
    //为了进入jsp页面
    @RequestMapping("/saveWeb.do")
    public ModelAndView saveWeb(){
        ModelAndView mv = new ModelAndView();
        List<String> userLists = us.selectTUser();
        List<String> websiteTypeLists = us.selectWebSiteType();
        mv.addObject("userLists",userLists);
        mv.addObject("webSiteTypeLists",websiteTypeLists);
        mv.setViewName("addWeb");
        return mv;
    }
    //执行业务
    @RequestMapping("/insertWeb.do")
    public ModelAndView insertWeb(@RequestParam(name="wid") String wid,@RequestParam(name="wname") String wname,@RequestParam(name="wurl") String wurl,
                                @RequestParam(name="websiteTypeSelect") String websiteType,@RequestParam(name="accessNum") String accessNum,@RequestParam(name="lastAccessDate") String lastAccessDate,
                                @RequestParam(name="createDate") String createDate,@RequestParam(name="userSelect") String userName){

        ModelAndView mv = new ModelAndView();
        if(wname==null||wname.equals("")||wurl==null||wurl.equals("")||websiteType==null||websiteType.equals("")||
                accessNum==null||accessNum.equals("")||lastAccessDate==null||lastAccessDate.equals("")||createDate==null||
                createDate.equals("")||userName==null||userName.equals("")){//判断内容是否为空
            mv.setViewName("erro");
            return mv;
        }


        Integer newWid = Integer.parseInt(wid);
        Integer newAccessNum = Integer.parseInt(accessNum);
        //判断主键是否被占用
        WebList list = us.selectOneWeb(newWid);

        if(list != null){
            mv.setViewName("erro");
            return mv;
        }else {
            ArrayList<Timestamp> timestamps = this.transformTime(lastAccessDate, createDate);
            System.out.println(timestamps.get(0));
            WebList webList = new WebList(newWid, wname, wurl, websiteType, newAccessNum, timestamps.get(0), timestamps.get(1), userName);
            us.insertWeb(webList);
            //在这里获取创建人 为创建人网站数量+1 网站类型的数量也要加1
            //先获取创建人
            TUser user = us.selectUserAccess(userName);
            user.setWebsite_num(user.getWebsite_num() + 1);
            us.updateUserWeb(user);

            TWebsiteType type = wts.getWebSiteType(websiteType);
            type.setWebsiteNum(type.getWebsiteNum() + 1);
            wts.updateWebSite(type);
            mv.setViewName("success");
        }
        return mv;
    }

    //模糊查询
    @RequestMapping("/selectLike.do")
    public ModelAndView selectLike(@RequestParam(name="webName") String webName,@RequestParam(name="userName") String userName){
        ModelAndView mv = new ModelAndView();
        System.out.println(webName);
        WebList wl = new WebList();
        wl.setName(webName);
        wl.setUserName(userName);
        List<WebList> webLists = us.selectLike(wl);
        mv.addObject("webLists",webLists);
//        mv.setViewName("redirect:/https://www.baidu.com");
        PageBean pb = pbs.getPageBean(1,webLists.size(),webLists.size());
        mv.addObject("pages",pb);
        mv.addObject("userName",userName);
        mv.addObject("webName",webName);
        mv.setViewName("WebsiteList");
        return mv;
    }


    @RequestMapping("/delete.do")
    public ModelAndView deleteWeb(@RequestParam(name="id") String id){
        ModelAndView mv = new ModelAndView();
        Integer newId = Integer.parseInt(id);
       //调用删除方法 将这个id下的网站删了 首先要查询创建人是谁 网站类型中的网站数量也要减一
        WebList webList = us.selectOneWeb(newId);

        System.out.println(webList);
        //查询创建人
        System.out.println(webList.getUserName());
        TUser user = us.selectUserAccess(webList.getUserName());
        System.out.println(user);
        user.setWebsite_num(user.getWebsite_num()-1);
        us.updateUserWeb(user);

        //查询网站
        TWebsiteType type = wts.getWebSiteType(webList.getTypeName());
        type.setWebsiteNum(type.getWebsiteNum()-1);
        wts.updateWebSite(type);

        wls.deleteWeb(newId);


        mv.setViewName("redirect:/firstPage.do");
        return mv;
    }



    //辅助的转化时间类型
    public ArrayList<Timestamp> transformTime(String lastAccessDate,String createDate){
        ArrayList<Timestamp> timestamps = new ArrayList<>();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH); //判定格式
        sdf.setLenient(false);
        Date lastTime = null;
        try {
            lastTime = sdf.parse(lastAccessDate);
            Date createTime = sdf.parse(createDate);
            Timestamp lt = new Timestamp(lastTime.getTime());
            Timestamp ct = new Timestamp(createTime.getTime());
            timestamps.add(lt);
            timestamps.add(ct);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return timestamps;
    }

}
