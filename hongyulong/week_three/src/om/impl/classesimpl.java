package om.impl;


        ;
import om.dao.classesDAO;
        import om.DUB.JDBC;
        import om.thing.classes;
        import om.DUB.JDBC;
        import om.dao.classesDAO;
        import org.apache.commons.dbutils.QueryRunner;
        import org.apache.commons.dbutils.handlers.BeanHandler;
        import org.apache.commons.dbutils.handlers.BeanListHandler;
        import org.apache.commons.dbutils.handlers.ScalarHandler;
        import java.sql.SQLException;
        import java.util.List;

public class classesimpl implements classesDAO {
    private QueryRunner runner=null;
    public classesimpl(){
        runner=new QueryRunner();
    }
    public void add(classes s)throws SQLException {
        String sql="insert into classes(stuid,class1,class2,class2) values(?,?,?,?)";
        runner.update(JDBC.getConnection(),sql,s.getStuid(),s.class1,s.class2,s.class3);
    }
    public void delete(String stuid)throws SQLException{
        String sql="delete from classes where stuid=?";
        runner.update(JDBC.getConnection(),sql,stuid);
    }
    public void update(classes s)throws SQLException{
        String sql="update student set class1=?,class2=?,class3=? where stuid=?";
        runner.update(JDBC.getConnection(),sql,s.getClass1(),s.getClass2(),s.class3,s.getStuid());
    }
    public classes findbyid(String stuid)throws SQLException{
        String sql="select name,age,gender from studnent where stuid=?";
        classes s=runner.query(JDBC.getConnection(),sql,new BeanHandler<classes>(classes.class),stuid);
        return s;
    }
    public List<classes> findall()throws SQLException{
        String sql="select name age,gender from student";
        List<classes> studnets=runner.query(JDBC.getConnection(),sql,new BeanListHandler<classes>(classes.class));
        return studnets;
    }
    public int personCount()throws SQLException{
        String sql="select count(stuid) from classes";
        return runner.query(sql, new ScalarHandler<Integer>());
    }
}
