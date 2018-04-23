<%--
  Created by IntelliJ IDEA.
  User: hongyulong
  Date: 2018/4/22
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" import="om.dao.studentDAO,om.impl.studentimpl,om.thing.student" %>
<%@ page import="java.util.List" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%
    studentimpl stu = new studentimpl();
    List<student> stus= stu.findall();
%>
<html>
<head>
    <title>学生信息列表</title>
    <div><a href="add.jsp">添加</a></div>
</head>
<body>
<h2>具体信息列表</h2>
<table border="1">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${requestScope.list}" var="student">
        <tr>
            <td>${student.stuid}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.gender}</td>
            <td>
                <a href="/student?method=find&stuid=${student.stuid}">修改</a>|
                <a href="/student?method=delete&stuid=${student.stuid}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="4"><a href="add.jsp">添加</a> </td>
    </tr>
</table>
</body>
</html>
