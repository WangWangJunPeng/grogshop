package com.wjp.service;

import java.util.List;

import com.wjp.pojo.GrogshopAndStatus;

public interface GrogshopAndStatusService {
	List<GrogshopAndStatus> getGrogshopStatus();
	List<GrogshopAndStatus> selectGrogshop(GrogshopAndStatus grogshopAndStatus);
}
