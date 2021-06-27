<%--
  Created by IntelliJ IDEA.
  User: 星星眼
  Date: 2021/5/8 0008
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>新建网页</title>
</head>
<body>
<h2 align="center">新建网页</h2>

<form action="insertWeb.do" method="post">
    <table align="center" border="1px" cellspacing="0px" cellpadding="10px" width="400px" >
        <tr>
            <td>网站id</td>
            <td><input type="text"  name="wid" value=""/>
            </td>
        </tr>
        <tr>
            <td>网站名称</td>
            <td><input type="text" name="wname" value=""/></td>
        </tr>
        <tr>
            <td>网站URL</td>
            <td><input type="text" name="wurl" value=""/></td>
        <tr>
            <td>网站类型</td>
            <td>
                <select class="websiteTypeSelect" name="websiteTypeSelect" >
                    <c:forEach items="${webSiteTypeLists}" var="stu">
                        <option name="webType" value="${stu}">${stu}</option>
                    </c:forEach>
                </select>
            </td>
            </td>
        </tr>
        <tr>
            <td>访问次数</td>
            <td><input type="text"  readonly="readonly" name="accessNum" value="0"></td>
        </tr>

        <tr>
            <td>最后一次修改时间</td>
            <td><input type="text" name="lastAccessDate" placeholder="例:2021-06-06 12:04:45" value=""></td>
        </tr>

        <tr>
            <td>创建时间</td>
            <td><input type="text" name="createDate" placeholder="例:2021-06-06 12:04:45" value=""></td>
        </tr>

        <tr>
            <td>创建人</td>
            <td>
                <select class="userSelect" name="userSelect" >
                    <c:forEach items="${userLists}" var="stu">
                        <option name="userName" value="${stu}">${stu}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
    </table>
    <center><input type="submit" value="保存"></center>
</form>
</body>
</html>
