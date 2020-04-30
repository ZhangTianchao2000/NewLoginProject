<%--
  Created by IntelliJ IDEA.
  User: 16174
  Date: 2020/4/28
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TestAjax</title>

    <script src="js/jquery.min.js" type="text/javascript"></script>

    <script>
        $(function () {
            $.ajax({
                url: "${pageContext.request.contextPath}/book/toAddBookAjax",
                type: "post", //以Post方式发送请求
                dataType: "json", //返回的数据类型
                success: function (data) {
                    //请求成功，执行的操作
                    alert(data);
                    alert(data.BookID);
                    alert(data.BookName);
                    alert(data.BookCounts);
                    alert(data.Detail);
                },
                error: function () {
                    //请求失败，执行的操作
                    alert("错误")
                }
            });
        });
    </script>

</head>
<body>

</body>
</html>
