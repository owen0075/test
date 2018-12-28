package com.spring.springcloud.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fiberhome.pojo.User;
import com.fiberhome.service.UserService;
import com.fiberhome.service.UserServiceImpl;

@Controller
public class UserControl {
	
    @Autowired
    private UserService userService;
    @Autowired
    private User user;
    
    @Resource
    private UserServiceImpl userServiceImpl;
    
    //显示用户
    @RequestMapping("list")
    @ResponseBody
    public List<User> index() throws Exception {
      return userService.getUser();
    }
    
    //显示用户
    @RequestMapping("getMap")
    @ResponseBody
    public Object getMap() throws Exception {
    	List<Map<String, Object>> listMap = userServiceImpl.getMap();
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("AS", "asd");
    	listMap.add(map);
    	return listMap;
    }
}
