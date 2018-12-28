package com.mk.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sync")
public class SyncControl {
    @RequestMapping("getTest")
	@ResponseBody
    public Object getTest() throws Exception {
    	return "test";
    }
}
