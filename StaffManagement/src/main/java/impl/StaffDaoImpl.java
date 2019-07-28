package impl;

import bean.Staff;
import dao.StaffDao;
import util.SqlQuery;

import java.util.ArrayList;

public class StaffDaoImpl implements StaffDao {
    public ArrayList<Staff> queryAll() {
        String sql="select * from staff";
        return SqlQuery.query(new Staff(),sql,new Object[]{});
    }

    public boolean add(Staff staff) {
        return false;
    }

    public boolean remove(String staId) {
        return false;
    }

    public boolean update(Staff staff) {
        return false;
    }
}
