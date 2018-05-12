package com.dao;

import com.jdbc.JDBC;
import com.jdbc.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.thing.student;
import com.jdbc.JDBC;


public class studentDAO {
    public Connection conn=null;

    public studentDAO(){

    }
    public int setstudent(List<student> data){
        int i = -1;
        JDBC rukou = new JDBC();
        this.conn = rukou.getConnection();

        try {
            Statement stmt = this.conn.createStatement();
            String sql = "select * from student";

            ResultSet rs;
            for(rs = stmt.executeQuery(sql); rs.next(); ++i) {
                student one = new student();
                one.name  = rs.getString("name");
                one.stuid = rs.getString("stuid");
                data.add(one);
            }

            rukou.free(rs, stmt, this.conn);
        } catch (SQLException var8) {
            var8.printStackTrace();
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        System.out.println("初始化成功!");
        return i;
    }

    public void update(student data) {
        JDBC entry = new JDBC();
        this.conn = entry.getConnection();

        try {
            Statement stmt = this.conn.createStatement();
            stmt.execute("insert into student(stuid,name) value('" + data.stuid + "','" + data.name+ "')");
            entry.free((ResultSet)null, stmt, this.conn);
        } catch (SQLException var4) {
            var4.printStackTrace();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        System.out.println("写入数据库成功!");
    }
}
