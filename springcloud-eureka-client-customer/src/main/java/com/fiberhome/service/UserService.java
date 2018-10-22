package com.fiberhome.service;

import java.util.List;
import com.fiberhome.pojo.User;

public interface UserService {
    //显示所有用户
    public List<User>getUser()throws Exception;
    //根据id删除用户
    public void deleteUser(int id)throws Exception;
    //新增用户
    public void addUser(User user)throws Exception;
}