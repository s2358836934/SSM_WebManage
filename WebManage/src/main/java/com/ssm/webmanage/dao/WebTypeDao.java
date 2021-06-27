package com.ssm.webmanage.dao;

import com.ssm.webmanage.domain.TWebsiteType;

import java.util.List;

public interface WebTypeDao {

    public List<TWebsiteType> showWebType();

    public TWebsiteType getWebSiteType(String typeName);

    public void updateWebSite(TWebsiteType type);
}
