package com.ssm.webmanage.dao;

import com.ssm.webmanage.domain.PageBean;
import com.ssm.webmanage.domain.TUser;
import com.ssm.webmanage.domain.User;
import com.ssm.webmanage.domain.WebList;

import java.util.List;

public interface TUserDao {
    //登录验证
    public User login();

    //展示用户网页
    public List<TUser> showUserWeb();

    //要查询出用户现有的访问量
    public TUser selectUserAccess(String userName);


    //用户访问量
    public void userAccess(TUser user);

    public void updateUserWeb(TUser user);


    //展示首页
    public List<WebList> showWeb(PageBean p);

    //获取数据的条数
    public Integer getDataNumber();

    //查询一个网站列表
    public WebList selectOneWeb(Integer id);


    //获取所有的tuser
    public List<String> selectTUser();

    //获取所有的websitetype
    public List<String> selectWebSiteType();

    //修改网页
    public void updateWeb(WebList webList);

    //新建网页
    public void insertWeb(WebList webList);

    //模糊查询的
    public List<WebList> selectLike(WebList list);
}
