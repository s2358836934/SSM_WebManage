package com.ssm.webmanage.domain;

public class TWebsiteType {
    private Integer id;
    private String typeName;
    private Integer website_num;

    public TWebsiteType() {
    }

    public TWebsiteType(Integer id, String typeName, Integer websiteNum) {
        this.id = id;
        this.typeName = typeName;
        this.website_num = websiteNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setName(String name) {
        this.typeName = name;
    }

    public Integer getWebsiteNum() {
        return website_num;
    }

    public void setWebsiteNum(Integer websiteNum) {
        this.website_num = websiteNum;
    }

    @Override
    public String toString() {
        return "TWebsiteType{" +
                "id=" + id +
                ", name='" + typeName + '\'' +
                ", websiteNum=" + website_num +
                '}';
    }
}
