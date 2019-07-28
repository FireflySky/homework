package dao;

import bean.User;

import java.util.ArrayList;

public interface UserDao {
    ArrayList queryAll();
    User queryById(String id);
    boolean add(User user);
    boolean remove(String userId);
    boolean update(User user);
}
