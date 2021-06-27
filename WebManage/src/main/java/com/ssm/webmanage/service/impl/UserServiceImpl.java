package com.ssm.webmanage.service.impl;

import com.ssm.webmanage.dao.TUserDao;
import com.ssm.webmanage.domain.PageBean;
import com.ssm.webmanage.domain.TUser;
import com.ssm.webmanage.domain.User;
import com.ssm.webmanage.domain.WebList;
import com.ssm.webmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TUserDao td;

    //登录方法
    @Override
    public boolean login(String userName,String password) {
        User u = td.login();
        if(u.getUser().equals(userName)&&u.getPassword().equals(password)){
            return true;
        }
        return false;
    }

    //展示user页面
    @Override
    public List<TUser> showUserWeb() {
        return td.showUserWeb();
    }

    //查询单个user对象
    @Override
    public TUser selectUserAccess(String userName) {
        return td.selectUserAccess(userName);
    }


    //用户访问
    @Override
    public void userAccess(TUser user) {
        td.userAccess(user);
    }

    @Override
    public void updateUserWeb(TUser user) {
        td.updateUserWeb(user);
    }

    //查询一个网站列表
    public WebList selectOneWeb(Integer id){
        return td.selectOneWeb(id);
    }



    @Override
    public Integer getDataNumber() {
        return td.getDataNumber();
    }
    @Override
    public List<WebList> showWeb(PageBean p) {
        return td.showWeb(p);
    }



    @Override
    public List<String> selectTUser() {
        return td.selectTUser();
    }

    @Override
    public List<String> selectWebSiteType() {
        return td.selectWebSiteType();
    }

    @Override
    public void updateWeb(WebList webList) {
        td.updateWeb(webList);
    }

    @Override
    public void insertWeb(WebList webList) {
        td.insertWeb(webList);
    }

    @Override
    public List<WebList> selectLike(WebList list) {
        return td.selectLike(list);
    }
}
