package com.ssm.webmanage.domain;

/**
 * 分页对象。用于封装当前页的分页相关的所有数据
 *
 */
public class PageBean {
    private Integer realPage; //实际页
    private Integer totalPage;//末页、总页数
    private Integer currentPage;//当前页
    private Integer totalCount;//总记录数
    private Integer pageSize;//每页显示的记录数

    public PageBean(Integer realPage, Integer totalPage, Integer currentPage, Integer totalCount, Integer pageSize) {
        this.realPage = realPage;
        this.totalPage = totalPage;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
    }

    public PageBean() {
    }

    public Integer getRealPage() {
        return realPage;
    }

    public void setRealPage(Integer realPage) {
        this.realPage = realPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


}