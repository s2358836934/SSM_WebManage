package com.ssm.webmanage.service;

import com.ssm.webmanage.domain.WebList;

public interface WebListService {

    public void deleteWeb(Integer id);


    //对网站进行操作
    public void renewWeb(WebList list);

}
