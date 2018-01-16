package com.dubbo.core.server.server;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.core.common.entity.Position;
import com.dubbo.core.common.server.DemoService;
import com.dubbo.core.server.mapper.PositionMapper;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Resource
	private PositionMapper positionMapper;

	@Override
	public String sayHello(String name) {
		Date nowTime=new Date();   
        SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        return MessageFormat.format("[{0}] {1}", time.format(nowTime), name); 
	}

	@RequestMapping("queryAll")
	@Override
	public List<Position> queryAll() {
		List<Position> list = new ArrayList<Position>();
		list = positionMapper.queryAll();
		return list;
	}
	
	

}
