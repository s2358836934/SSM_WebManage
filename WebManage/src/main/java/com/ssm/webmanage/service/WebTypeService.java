package com.ssm.webmanage.service;

import com.ssm.webmanage.domain.TWebsiteType;

import java.util.List;

public interface WebTypeService {

    public List<TWebsiteType> showWebType();

    //查询出一个WebType
    public TWebsiteType getWebSiteType(String typeName);

    //Web数量更改
    public void updateWebSite(TWebsiteType type);
}
