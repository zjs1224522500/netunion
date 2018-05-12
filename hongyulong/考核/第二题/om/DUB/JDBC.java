package om.DUB;

import java.sql.*;

public class JDBC {
    public final static String driver = "com.mysql.jdbc.Driver";
    public final static String url = "jdbc:mysql://localhost:3306/studnet";
    public final static String user = "root";
    public final static String password = "hyl2hr1314";

    private JDBC(){}
    static{
        try {
            Class.forName(driver);
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(ResultSet rs,Statement stat,Connection conn){

    }
}

