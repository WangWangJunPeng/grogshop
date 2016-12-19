package com.wjp.mapper;

import java.util.List;

import com.wjp.pojo.GrogshopAndStatus;

public interface GrogshopAndStatusMapper {
	List<GrogshopAndStatus> selectGrogshopAndStatus();
	List<GrogshopAndStatus> selectByGS(GrogshopAndStatus grogshopAndStatus);
}
