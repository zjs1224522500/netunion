package com.dao;

import com.jdbc.JDBC;
import com.thing.classes;
import com.jdbc.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class classesDAO {
    public Connection conn=null;
    public classesDAO(){

    }

    public int setclasses(List<classes> data){
        int i = -1;
        JDBC entry = new JDBC();
        this.conn = entry.getConnection();
        try {
            Statement stmt = this.conn.createStatement();
            String sql = "select * from classes";

            ResultSet rs;
            for(rs = stmt.executeQuery(sql); rs.next(); ++i) {
                classes one = new classes();
                one.name  = rs.getString("name");
                one.stuid = rs.getString("stuid");
                one.classname=rs.getString("classname");
                data.add(one);
            }

            entry.free(rs, stmt, this.conn);
        } catch (SQLException var8) {
            var8.printStackTrace();
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        System.out.println("初始化成功!");
        return i;
    }
    public void update(classes data) {
        JDBC entry = new JDBC();
        this.conn = entry.getConnection();

        try {
            Statement stmt = this.conn.createStatement();
            stmt.execute("insert into classes(classname,stuid,name) value(('" + data.classname + "','" + data.stuid + "','" + data.name +"')");
            entry.free((ResultSet)null, stmt, this.conn);
        } catch (SQLException var4) {
            var4.printStackTrace();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        System.out.println("写入数据库成功!");
    }
}
