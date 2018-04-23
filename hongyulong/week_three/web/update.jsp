<%@ page import="om.dao.studentDAO" %>
<%@ page import="om.impl.studentimpl" %>
<%@ page import="om.thing.student" %><%--
  Created by IntelliJ IDEA.
  User: hongyulong
  Date: 2018/4/23
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student"method="post"value="updata">
    name=<iuput type="text" name="name" value="${student.name}"/><<br/>
    age=<iuput type="text" name="age" value="${student.age}"/><br/>
    fender=<iuput type="text" name="gender" value="${student.gender}"/><br/>
    stuid=<iuput type="text" name="stuid" readonly="readonly" value="${student.stuid}"/><br/>
    <input type="submit"value="Sure"/>
</form>
</body>
</html>
