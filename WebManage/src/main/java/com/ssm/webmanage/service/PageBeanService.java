package com.ssm.webmanage.service;

import com.ssm.webmanage.domain.PageBean;

public interface PageBeanService {

/**
 * 提供用于封装PageBean对象方法
 */
    public PageBean getPageBean(Integer  currentPage,Integer pageSize);
    public PageBean getPageBean(Integer  currentPage,Integer pageSize,Integer totalCount);
}
