package com.banyan.tube.mapper;

import com.banyan.tube.entity.TokenHistory;

public interface TokenHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TokenHistory record);

    int insertSelective(TokenHistory record);

    TokenHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TokenHistory record);

    int updateByPrimaryKey(TokenHistory record);
}