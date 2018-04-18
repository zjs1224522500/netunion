package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {


    public Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/student?useSSL=false";
        String user = "root";
        String password = "hyl2hr1314";
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("连接数据库成功！");
        } catch (Exception var7) {
            var7.printStackTrace();
        }
        return conn;
    }
    public void free(ResultSet rs, Statement sta, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }

            if (sta != null) {
                sta.close();
                sta = null;
            }

            if (conn != null) {
                conn.close();
                conn = null;
            }

            System.out.println("关闭连接成功");
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }
}
