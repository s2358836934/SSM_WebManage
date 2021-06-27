package com.ssm.webmanage.dao;

import com.ssm.webmanage.domain.WebList;

public interface WebListDao {

    //删除
    public void deleteWeb(Integer id);

    //更新访问时间
    public void renewWeb(WebList list);

}
