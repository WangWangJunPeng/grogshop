package com.wjp.service;

import java.util.List;

import com.wjp.pojo.Grogshop;

public interface GrogshopService {
	List<Grogshop> getGrogshops();
	List<Grogshop> selectByName(String name);
	int changeStatus(Grogshop grogshop);
}
