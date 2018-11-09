package com.banyan.tube.mapper;

import com.banyan.tube.entity.TubeComment;

public interface TubeCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TubeComment record);

    int insertSelective(TubeComment record);

    TubeComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TubeComment record);

    int updateByPrimaryKey(TubeComment record);
}