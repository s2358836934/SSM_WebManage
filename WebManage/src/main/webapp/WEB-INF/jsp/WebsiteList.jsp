<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>网站列表</title>
</head>
<body>
<h1 align="center">网站列表</h1>
<form action="selectLike.do" method="post">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;
    <input type="text" placeholder="网站名称" name="webName" value="${webName}">
    <input type="text" placeholder="创建人" name="userName" value="${userName}">
    <input type="submit" value="查询">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" ><a href="saveWeb.do" style="text-align: right">添加网站</a></button>
    <table align="center" border="1">
        <tr>
            <th>序号</th>
            <th>网站名称</th>
            <th>网站URL</th>
            <th>网站类型</th>
            <th>访问次数</th>
            <th>最后一次访问时间</th>
            <th>创建时间</th>
            <th>创建人</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${webLists}" var="stu">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
                <td>${stu.url}</td>
                <td>${stu.typeName}</td>
                <td>${stu.access_num}</td>
                <td>${stu.last_access_date}</td>
                <td>${stu.create_date}</td>
                <td>${stu.userName}</td>
                <td><a href="access.do?userName=${stu.userName}&url=${stu.url}&id=${stu.id}&access_num=${stu.access_num}">访问&nbsp;</a></td>
                <td><a href="delete.do?id=${stu.id}"
                       onclick="return confirm('你确认要删除该学生信息吗?')">删除&nbsp;</a></td>
            </tr>
        </c:forEach>
    </table>
    <center>
        <button type="button"> <a href="firstPage.do">首页</a></button>
        &nbsp;
        <button type="button"><a href="previousPage.do?currentPage=${pages.currentPage}">上一页</a></button>
        &nbsp;
        <button type="button"><a href="nextPage.do?totalPage=${pages.totalPage}&currentPage=${pages.currentPage}">下一页</a></button>
        &nbsp;
        <button type="button"><a href="lastPage.do?totalPage=${pages.totalPage}">尾页</a></button>
        <p>第 <span>${pages.currentPage}</span> 页/每页 <span>${pages.pageSize}</span> 记录/共 <span>${pages.totalPage}</span> 页/共 <span>${pages.totalCount}</span> 条记录</p>
    </center>
</body>
</html>