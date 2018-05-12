package om.dao;

import java.sql.SQLException;
import java.util.List;
import om.thing.student;


public interface studentDAO {
    public void add(student s)throws SQLException;
    public void delete(String stuid)throws SQLException;
    public void update(student s)throws SQLException;
    public student findbyid(String stuid)throws SQLException;
    public List<student> findall()throws SQLException;
    public int personCount()throws SQLException;
}

