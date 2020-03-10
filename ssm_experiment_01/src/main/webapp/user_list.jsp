<%--
  Created by IntelliJ IDEA.
  User: luanz
  Date: 2020/3/9
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%-- 导入jstl标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<hr/>
<table border="1px" width="50%" cellspacing="0px" cellpadding="10px" align="center">
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <%-- 使用c:forEach标签遍历用户List集合列表 --%>
    <%-- items: 用于接收集合对象 --%>
    <%-- var: 定义对象接收从集合里遍历出的每一个元素 --%>
    <%-- varStatus: 可以方便实现一些与行数相关的功能，是循环索引 --%>
    <c:forEach items="${userlist}" var="user" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
