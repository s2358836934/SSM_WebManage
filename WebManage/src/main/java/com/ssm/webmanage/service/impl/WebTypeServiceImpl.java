package com.ssm.webmanage.service.impl;

import com.ssm.webmanage.dao.WebTypeDao;
import com.ssm.webmanage.domain.TWebsiteType;
import com.ssm.webmanage.service.WebTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebTypeServiceImpl implements WebTypeService {

    @Autowired
    private WebTypeDao wtd;

    @Override
    public List<TWebsiteType> showWebType() {
        return wtd.showWebType();
    }

    @Override
    public TWebsiteType getWebSiteType(String typeName) {
        return wtd.getWebSiteType(typeName);
    }

    @Override
    public void updateWebSite(TWebsiteType type) {
        wtd.updateWebSite(type);
    }
}
