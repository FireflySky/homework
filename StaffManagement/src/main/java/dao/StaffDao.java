package dao;

import bean.Staff;

import java.util.ArrayList;

public interface StaffDao {
    ArrayList<Staff> queryAll();
    boolean add(Staff staff);
    boolean remove(String staId);
    boolean update(Staff staff);
}
