package com.dubbo.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.core.common.entity.Position;
import com.dubbo.core.common.server.DemoService;

@Controller
public class MyController {
//	@Autowired
//	private DemoService demoService;
	@Reference
	private DemoService demoService;//调用Dubbo暴露的接口
	
	@RequestMapping("/test")
	@ResponseBody
	public String testSay(@RequestParam(value = "name",defaultValue = "") String name){
        StringBuffer sb = new StringBuffer();
        sb.append("Dubbo调用提供端: ").append(demoService.sayHello(name));
        sb.append("成功。");
        return sb.toString();
    }
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public Map<String, Object> queryAll(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Position> list = demoService.queryAll();
		map.put("list", list);
		return map;
	}
}
