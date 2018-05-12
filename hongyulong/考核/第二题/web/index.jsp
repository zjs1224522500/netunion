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
  <body>
  <a href="student?method=findall">
    查看所有人的基本信息
  </a>
  <h2>请输入你要查找学生的学号</h2>
  <form action="student"method="post">
        <input type="hidden" name="method" value="find">
        <input type="text " name="stuid">
        <input type="submit" name="提交">
  </form>
  </body>
</html>
