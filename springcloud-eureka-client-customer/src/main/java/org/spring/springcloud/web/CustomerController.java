package org.spring.springcloud.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.DBManage.mysqlManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private RestTemplate restTemplate; // HTTP 访问操作类

    @RequestMapping("/customer")
    @ResponseBody
    public String customer() throws Exception {
		try {
			String providerMsg = restTemplate.getForEntity(
					"http://customer-service/provider", String.class).getBody();

			return "Hello,Customer! msg from provider : <br/><br/> "
					+ providerMsg;
		} catch (Exception ex) {
			throw ex;
		}
    }
    
    @RequestMapping("/provider")
    @ResponseBody
    public Object provider() throws Exception {
		try {
			mysqlManage mm = new mysqlManage();
			return mm.ConnDB();
		} catch (Exception ex) {
			throw ex;
		}
    }
}