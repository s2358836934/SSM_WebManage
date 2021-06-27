package com.ssm.webmanage.service;

import com.ssm.webmanage.domain.PageBean;
import com.ssm.webmanage.domain.TUser;
import com.ssm.webmanage.domain.WebList;

import java.util.List;

public interface UserService {

    //登录方法
    public boolean login(String userName,String password);

    //展示用户列表
    public List<TUser> showUserWeb();

    //获取用户
    public TUser selectUserAccess(String userName);

    //用户访问 访问量+1
    public void userAccess(TUser user);

    //用户创建网站数量+1
    public void updateUserWeb(TUser user);



    //查询一个网站列表
    public WebList selectOneWeb(Integer id);



    //展示页面
    public List<WebList> showWeb(PageBean p);

    //获取数据的条数
    public Integer getDataNumber();

    //获取所有的tuser
    public List<String> selectTUser();

    //获取所有的websitetype
    public List<String> selectWebSiteType();


    //修改网页列表
    public void updateWeb(WebList webList);

    //新建网页
    public void insertWeb(WebList webList);

    //模糊查询
    public List<WebList> selectLike(WebList list);
}
