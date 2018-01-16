package com.dubbo.core.common.server;

import java.util.List;

import com.dubbo.core.common.entity.Position;

/**  
*服务接口 
*/  
public interface DemoService {  
    public String sayHello(String name);
    
    public List<Position> queryAll();
}  