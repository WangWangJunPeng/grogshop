package com.wjp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjp.mapper.GrogshopAndStatusMapper;
import com.wjp.pojo.GrogshopAndStatus;
import com.wjp.service.GrogshopAndStatusService;

@Service
public class GrogshopAndStatusServiceImpl implements GrogshopAndStatusService{

	@Autowired
	private GrogshopAndStatusMapper grogshopAndStatusMapper;
	
	public List<GrogshopAndStatus> getGrogshopStatus() {

		return grogshopAndStatusMapper.selectGrogshopAndStatus();
	}

	public List<GrogshopAndStatus> selectGrogshop(GrogshopAndStatus grogshopAndStatus) {
		return grogshopAndStatusMapper.selectByGS(grogshopAndStatus);
	}

}
