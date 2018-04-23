package om.ser;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import om.dao.studentDAO;
import om.impl.studentimpl;
import om.thing.student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.Executor;

public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
       doPost(req, resp);
   }
   protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String method=req.getParameter("method");
        if("findall".equals(method)){
            findall(req, resp);;
        }else if("find".equals(method)){
            find(req, resp);
        }else if("update".equals(method)){
            update(req, resp);
        }else if("add".equals(method)){
            add(req, resp);
        }else if("delete".equals(method)){
            delete(req, resp);
        }
   }
    protected void add(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String name=req.getParameter("name");
        String stuid=req.getParameter("stuid");
        String gender=req.getParameter("gender");
        String age=req.getParameter("age");
        student stu=new student(stuid,name,age,gender);
        studentDAO dao = new studentimpl();
        try {
            dao.add(stu);
            resp.sendRedirect(req.getContextPath()+"/student?method=findall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected void delete(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String stuid =req.getParameter("stuid");
        studentDAO dao = new studentimpl();
        try {
            dao.delete(stuid);
            resp.sendRedirect(req.getContextPath()+"/student?method=findall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected void update(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String name=req.getParameter("name");
        String stuid=req.getParameter("stuid");
        String gender=req.getParameter("gender");
        String age=req.getParameter("age");
        student stu =new student(stuid,name,age,gender);
        studentDAO dao=new studentimpl();
        try {
            dao.update(stu);
            resp.sendRedirect(req.getContextPath()+"/student?method=findall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected void find(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        String stuid=req.getParameter("stuid");
        studentDAO dao=new studentimpl();
        try {
            student stu=dao.findbyid(stuid);
            req.setAttribute("student",stu);
            req.getRequestDispatcher("update.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }protected void findall(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
        studentDAO dao= new studentimpl();
        try {
            List<student> list =dao.findall();
            req.getRequestDispatcher("list.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
