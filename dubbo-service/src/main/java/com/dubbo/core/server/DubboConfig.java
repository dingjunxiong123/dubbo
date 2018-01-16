package com.dubbo.core.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConfig {
	
	public void start() {
		String providerPath = "/provider.xml";
		String mybitaisPath = "/serverConfig/spring-mybitis.xml";
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
        		providerPath, mybitaisPath});  
        context.start();  
        System.out.println( "服务提供者启动" );
	}
	
}
