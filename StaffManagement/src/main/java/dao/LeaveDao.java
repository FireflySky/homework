package dao;

import bean.Leave;

import java.util.ArrayList;

public interface LeaveDao {
    ArrayList<Leave> queryAll();
    boolean add(Leave leave);
    boolean remove(String leaId);
    boolean update(Leave leave);
}
