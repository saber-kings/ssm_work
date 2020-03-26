<%--
  Created by IntelliJ IDEA.
  User: luanz
  Date: 2020/3/26
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>书本列表</title>
</head>
<body>
<div style="text-align: center;">
    <table style="width: 60%;margin: 0 auto;" border="1" width="60%" cellspacing="0px" cellpadding="10px">
        <tr>
            <td>序号</td>
            <td>书名</td>
            <td>价格</td>
            <td>操作</td>
        </tr>
        <%--@elvariable id="bookList" type="java.util.List"--%>
        <c:forEach items="${bookList}" var="book" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${book.name}</td>
                <td>${book.price}</td>
                <td>删除 修改</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
