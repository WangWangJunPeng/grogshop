package com.wjp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjp.mapper.GrogshopMapper;
import com.wjp.pojo.Grogshop;
import com.wjp.service.GrogshopService;
@Service
public class GrogshopServiceImpl implements GrogshopService{

	@Autowired
	private GrogshopMapper grogshopMapper;
	
	public List<Grogshop> getGrogshops() {
		
		return grogshopMapper.selectGrogshops();
	}

	public List<Grogshop> selectByName(String name) {
		
		return grogshopMapper.selectByName(name);
	}

	public int changeStatus(Grogshop grogshop) {
		return grogshopMapper.updateById(grogshop);
	}
}
