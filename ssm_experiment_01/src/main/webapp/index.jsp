<%--
  Created by IntelliJ IDEA.
  User: luanz
  Date: 2020/3/9
  Time: 16:59
  isELIgnored: 启用EL表达式
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h2>Hello World!</h2>
${pageContext.request.contextPath}
<h3><a href="${pageContext.request.contextPath}/userFindListServlet">跳转到 用 户列表页面</a></h3>
</body>
</html>
