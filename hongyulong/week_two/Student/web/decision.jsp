<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.lang.String"%>
<%@page import="com.dao.classesDAO"%>
<%@page import="com.dao.studentDAO" %>
<%@page import="com.thing.student" %>
 <%@page import="com.thing.classes" %>

<%
    request.setCharacterEncoding("UTF-8");
    String name=request.getParameter("user");
    String stuid=request.getParameter("stuid");
    if(name!=null&&stuid!=null){
        out.print("进入系统");
        classes stu = new classes();
        classesDAO haha = new classesDAO();
        haha.update(stu);
    }
    if(name!=null&&stuid!=null){
        out.println("主页");
        classesDAO classes = new classesDAO();
        List<classes> stu = new ArrayList<classes>();
        student curuser = new student();
        int usermax = classes.setclasses(stu);
        try{
        out.print(stu.get(usermax-1).classname.equals(name));}
        catch (ArrayIndexOutOfBoundsException var1){}
        for(int i=0;i<=usermax;i++){
            if(stu.get(i).name.equals(name)){
                if(stu.get(i).stuid.equals(stuid)){
                    out.println("名字"+name);
                    out.print("所选课程"+stu.get(i).classname);
                }else{
                    out.println("请重新输入");//弹窗显示密码错误
                    response.sendRedirect("index.jsp");
                    break;
                }
            }
            if(i == usermax){
                System.out.println("未找到此用户!");
            }
        }
    }

%>
