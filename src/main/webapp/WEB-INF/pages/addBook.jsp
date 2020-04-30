<%--
  Created by IntelliJ IDEA.
  User: 16174
  Date: 2020/4/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    书籍名称:<input type="text" name="bookName"><br>
    书籍数量:<input type="text" name="bookCounts"><br>
    书籍详情:<input type="text" name="detail"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
