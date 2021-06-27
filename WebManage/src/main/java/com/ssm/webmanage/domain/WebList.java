package com.ssm.webmanage.domain;


import java.sql.Timestamp;
import java.util.Date;

public class WebList {
    private Integer id;
    private String name;
    private String url;
    private String typeName;
    private Integer access_num;
    private Timestamp last_access_date;
    private Timestamp create_date;
    private String userName;

    public WebList(Integer id, String name, String url, String typeName, Integer access_num, Timestamp last_access_date, Timestamp create_date, String userName) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.typeName = typeName;
        this.access_num = access_num;
        this.last_access_date = last_access_date;
        this.create_date = create_date;
        this.userName = userName;
    }

    public WebList() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getAccess_num() {
        return access_num;
    }

    public void setAccess_num(Integer access_num) {
        this.access_num = access_num;
    }

    public Date getLast_access_date() {
        return last_access_date;
    }

    public void setLast_access_date(Timestamp last_access_date) {
        this.last_access_date = last_access_date;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "TWebsite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", typeId=" + typeName +
                ", access_num=" + access_num +
                ", last_access_date=" + last_access_date +
                ", create_date=" + create_date +
                ", userid=" + userName +
                '}';
    }
}
