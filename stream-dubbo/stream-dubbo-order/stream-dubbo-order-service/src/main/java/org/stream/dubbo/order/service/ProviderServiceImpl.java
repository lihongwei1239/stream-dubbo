package org.stream.dubbo.order.service;

import org.springframework.stereotype.Service;
import org.stream.dubbo.service.order.api.ProviderService;

/** 
 * 功能概要：功能概要：提供者service实现层 
 *  
 */
@Service
public class ProviderServiceImpl implements ProviderService {  
  
    public String sayHello(String name) {         
        return "Hello:~~~~~~~~~~~~~~~~~~~~~~~~"+name+"你好，你好~~";  
    }  
  
}  
