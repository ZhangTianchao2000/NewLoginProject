<%--
  Created by IntelliJ IDEA.
  User: 16174
  Date: 2020/4/24
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <input type="hidden" name="bookID" value="${book.getBookID()}">
    书籍名称:<input type="text" name="bookName" value="${book.getBookName()}"><br>
    书籍数量:<input type="text" name="bookCounts" value="${book.getBookCounts()}"><br>
    书籍详情:<input type="text" name="detail" value="${book.getDetail()}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
