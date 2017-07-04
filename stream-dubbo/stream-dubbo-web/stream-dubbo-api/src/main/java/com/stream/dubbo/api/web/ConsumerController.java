package com.stream.dubbo.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.stream.dubbo.service.order.api.ProviderService;

@Controller
@RequestMapping("api/consumer")
public class ConsumerController {
	
	@Autowired
	private ProviderService providerService;
	
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public void sayHello() throws Exception {
    	providerService.sayHello("test01");
    }


}
