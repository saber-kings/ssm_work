<%--
  Created by IntelliJ IDEA.
  User: luanz
  Date: 2020/3/27
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<body>
<form action="${pageContext.request.contextPath}/account/transfer.do" method="post">
    <label>
        转钱方：&emsp;
        <input type="text" name="outAccount"/><br>
    </label>
    <label>
        收钱方：&emsp;
        <input type="text" name="inAccount"/><br>
    </label>
    <label>
        转账额度：
        <input type="text" name="money"/><br>
    </label>
    <input type="submit"/>
</form>
</body>
</html>
