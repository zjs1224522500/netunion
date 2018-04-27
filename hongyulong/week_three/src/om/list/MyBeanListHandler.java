package om.list;

import om.thing.student;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class MyBeanListHandler extends BeanListHandler<student>
{
    public MyBeanListHandler(Class type) {
        super(type);
    }
    @Override
    public List<student> handle(ResultSet rs) throws SQLException {
        List<student> list=new ArrayList<student>();
        while(rs.next())
        {
            student student=new student();
            student.setStuid(rs.getString("stuid"));
            student.setGender(rs.getString("gender"));
            student.setAge(rs.getString("age"));
            student.setName(rs.getString("name"));
            list.add(student);
        }
        return list;
    }
}