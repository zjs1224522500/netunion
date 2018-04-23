package om.impl;

import om.dao.studentDAO;
import om.DUB.JDBC;
import om.thing.student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class studentimpl implements studentDAO {
    private QueryRunner runner=null;
    public studentimpl(){
        runner=new QueryRunner();
    }
    public void add(student s)throws SQLException{
        String sql="insert into student(stuid,name,age,gender) values(?,?,?,?)";
        runner.update(JDBC.getConnection(),sql,s.getStuid(),s.getName(),s.getAge(),s.getGender());
    }
    public void delete(String stuid)throws SQLException{
        String sql="delete from student where stuzxid=?";
        runner.update(JDBC.getConnection(),sql,stuid);
    }
    public void update(student s)throws SQLException{
        String sql="update student set name=?,age=?,gender=? where stuid=?";
        runner.update(JDBC.getConnection(),sql,s.getStuid(),s.getName(),s.getAge(),s.getGender());
    }
    public student findbyid(String stuid)throws SQLException{
        String sql="select name,age,gender from studnent where stuid=?";
        student s=runner.query(JDBC.getConnection(),sql,new BeanHandler<student>(student.class),stuid);
        return s;
    }
    public List<student> findall()throws SQLException{
        String sql="select name age,gender from student";
        List<student> studnets=runner.query(JDBC.getConnection(),sql,new BeanListHandler<student>(student.class));
        return studnets;
    }
    public int personCount()throws SQLException{
        String sql="select count(stuid) from student";
        return runner.query(sql, new ScalarHandler<Integer>());
    }
}
