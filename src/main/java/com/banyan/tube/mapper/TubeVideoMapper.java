package com.banyan.tube.mapper;

import java.util.List;

import com.banyan.tube.entity.TubeVideo;

public interface TubeVideoMapper {
	
	List<TubeVideo> getAll();
	
    int deleteByPrimaryKey(Integer id);

    int insert(TubeVideo record);

    int insertSelective(TubeVideo record);

    TubeVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TubeVideo record);

    int updateByPrimaryKeyWithBLOBs(TubeVideo record);

    int updateByPrimaryKey(TubeVideo record);
}