<%--
  Created by IntelliJ IDEA.
  User: hongyulong
  Date: 2018/4/12
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <br>
  <h1>
    请输入你的学号
  </h1>
  <form action = "decision.jsp" method="post">
    姓名:<input type="text" name="user"><br/>
    学号：<input type="text"name="stuid"><br/>
    <input type="submit" name="提交">
  </form>
  </body>
</html>
