<%--
  Created by IntelliJ IDEA.
  User: 16174
  Date: 2020/4/23
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/checkLogin" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input id="username" name="username" type="text"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
            <td><input type="button" value="注册" onclick="window.location.href='/user/regist'"></td>
        </tr>
    </table>
</form>
</body>
</html>
