<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=drive-width,initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="login.css">
    <!-- font-awesome 图标字体 http://www.fontawesome.com.cn/faicons/#web-application -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" media="screen" rel="stylesheet" type="text/css">
    <title>Login</title>
</head>
<div id="login-box">
    <h1>Login</h1>
    <form action="login.do" method="post">
    <div class="form">
        <div class="item">
            <i class="fa fa-user-circle-o" aria-hidden="true"></i>
            <input type="text" placeholder="Username" name="userName">
        </div>
        <div class="item">
            <i class="fa fa-key" aria-hidden="true"></i>
            <input type="password" placeholder="Password" name="password">
        </div>
    </div>
    <button>Login</button>
    </form>
</div>
<body>
</body>
</html>
<%--<html>--%>
<%--<body>--%>

<%--    <h2 align="center">网站系统</h2>--%>
<%--    <div align="center" height="200" width="200">--%>
<%--        <form action="login.do" method="post">--%>
<%--            用户名:<input type="text" name="userName" value=""><br>--%>
<%--            密&nbsp;&nbsp;&nbsp;码:<input name="password" type="password" value><br>--%>
<%--            <input type="submit" value="登录">--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</body>--%>
<%--</html>--%>