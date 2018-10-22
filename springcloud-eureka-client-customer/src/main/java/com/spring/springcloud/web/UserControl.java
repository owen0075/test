package com.spring.springcloud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fiberhome.pojo.User;
import com.fiberhome.service.UserService;

@Controller
public class UserControl {
	
    @Autowired
    private UserService userService;
    @Autowired
    private User user;
    
    //显示用户
    @RequestMapping("list")
    @ResponseBody
    public List<User> index() throws Exception {
      return userService.getUser();
    }
}
