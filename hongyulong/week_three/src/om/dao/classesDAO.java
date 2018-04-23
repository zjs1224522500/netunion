package om.dao;

import om.thing.classes;
import java.sql.SQLException;
import java.util.List;

public interface classesDAO {
    public void add(classes s)throws SQLException;
    public void delete(String stuid)throws SQLException;
    public void update(classes s)throws SQLException;
    public classes findbyid(String stuid)throws SQLException;
    public List<classes> findall()throws SQLException;
    public int personCount()throws SQLException;
}
