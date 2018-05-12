<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: hongyulong
  Date: 2018/5/12
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page import="om.thing.student" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
<h2>你的结果</h2>
<table border="1">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>

        <tr>
            <%student st =(student) request.getAttribute("stu");%>
            <td> <%out.print(st.stuid);%></td>
            <td><%out.print(st.name);%></td>
            <td><%out.print(st.gender);%></td>
            <td><%out.print(st.age);%></td>
        </tr>

</table>
</body>
</html>
