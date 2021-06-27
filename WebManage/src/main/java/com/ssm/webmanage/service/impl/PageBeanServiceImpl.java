package com.ssm.webmanage.service.impl;

import com.ssm.webmanage.domain.PageBean;
import com.ssm.webmanage.service.PageBeanService;
import com.ssm.webmanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PageBeanServiceImpl implements PageBeanService {

    @Autowired
    private UserService us;

    @Override
    public PageBean getPageBean(Integer currentPage, Integer pageSize) {
        PageBean pb = new PageBean();
        //设置当前页
        pb.setCurrentPage(currentPage);
        pb.setRealPage((currentPage-1)*5);

//        System.out.println(pb.getRealPage());
        //设置每页显示的记录数
        pb.setPageSize(pageSize);
        /**
         * 从数据库中查询出总记录数
         */
        int totalCount = us.getDataNumber();
        //设置总记录数
        pb.setTotalCount(totalCount);

        //设置总页数
        int pageNumber = pb.getTotalCount()%pb.getPageSize()==0 ?
                pb.getTotalCount()/pb.getPageSize()
                :pb.getTotalCount()/pb.getPageSize()+1;
        pb.setTotalPage(pageNumber);
        return pb;
    }

    //当给出总记录数时
    public PageBean getPageBean(Integer currentPage, Integer pageSize,Integer totalCount){
        PageBean pb = new PageBean();
        //设置当前页
        pb.setCurrentPage(currentPage);
        pb.setRealPage((currentPage-1)*5);
        //设置每页显示的记录数
        pb.setPageSize(pageSize);
        //设置总记录数
        pb.setTotalCount(totalCount);
        //设置总页数
        int pageNumber = pb.getTotalCount()%pb.getPageSize()==0 ?
                pb.getTotalCount()/pb.getPageSize()
                :pb.getTotalCount()/pb.getPageSize()+1;
        pb.setTotalPage(pageNumber);
        return pb;
    }
}
