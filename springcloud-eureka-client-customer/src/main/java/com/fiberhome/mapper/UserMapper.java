package com.fiberhome.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fiberhome.pojo.User;
@Mapper
public interface UserMapper {

    //获取用户名单
    public List<User> getUser() throws Exception;
    //根据id删除用户
    public void deleteUser(int id)throws Exception;
    //新增用户
    public void addUser(User user)throws Exception;
}