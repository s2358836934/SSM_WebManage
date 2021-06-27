package com.ssm.webmanage.service.impl;

import com.ssm.webmanage.dao.WebListDao;
import com.ssm.webmanage.domain.WebList;
import com.ssm.webmanage.service.WebListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WebListServiceImpl implements WebListService {


    @Autowired
    private WebListDao wld;




    @Override
    public void deleteWeb(Integer id) {
        wld.deleteWeb(id);
    }


    @Override
    public void renewWeb(WebList list) {
        wld.renewWeb(list);
    }
}
