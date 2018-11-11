package com.banyan.tube.mapper;

import java.util.List;

import com.banyan.tube.entity.Video;
import com.banyan.tube.form.VideoForm;

public interface VideoMapper {
	
	List<Video> selectAll(Integer id);
	
	List<Video> search(VideoForm videoF);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}