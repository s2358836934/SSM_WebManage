package com.ssm.webmanage.domain;

public class TUser {
    private Integer id;
    private String userName;
    private Integer website_num;
    private Integer website_access_num;

    public TUser(Integer id, String userName, Integer websiteNum, Integer websiteAccessNum) {
        this.id = id;
        this.userName = userName;
        this.website_num = websiteNum;
        this.website_access_num = websiteAccessNum;
    }

    public TUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public Integer getWebsite_num() {
        return website_num;
    }

    public void setWebsite_num(Integer websiteNum) {
        this.website_num = websiteNum;
    }

    public Integer getWebsite_access_num() {
        return website_access_num;
    }

    public void setWebsite_access_num(Integer websiteAccessNum) {
        this.website_access_num = websiteAccessNum;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", websiteNum=" + website_num +
                ", websiteAccessNum=" + website_access_num +
                '}';
    }
}
