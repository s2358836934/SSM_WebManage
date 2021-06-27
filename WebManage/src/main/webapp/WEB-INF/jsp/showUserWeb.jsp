<%--
  Created by IntelliJ IDEA.
  User: 星星眼
  Date: 2021/5/8 0008
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 星星眼
  Date: 2021/5/8 0008
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <style type="text/css">
        table.imagetable {
            font-family: verdana,arial,sans-serif;
            font-size:25px;
            color:#333333;
            border-width: 1px;
            border-color: #999999;
            border-collapse: collapse;
        }
        table.imagetable th {
            background:#b5cfd2 url('https://img-my.csdn.net/uploads/201209/08/1347078600_3763.jpg');
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #999999;
        }
        table.imagetable td {
            background:#dcddc0 url('https://img-my.csdn.net/uploads/201209/08/1347078645_1925.jpg');
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #999999;
        }
    </style>
</head>
<body>
<h1 align="center">用户列表</h1>

<!-- Table goes in the document BODY -->
<table class="imagetable" align="center">
    <tr>
        <th>序号</th><th>用户名称</th><th>创建网站数量</th><th>网站访问量</th>
    </tr>

    <c:forEach items="${userList}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.userName}</td>
            <td>${stu.website_num}</td>
            <td>${stu.website_access_num}</td>
        </tr>
    </c:forEach>



</table>

</body>
</html>
