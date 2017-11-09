package com.fg.cloud.manager.mapper;

import com.fg.cloud.manager.entry.AgencyLevel;

public interface AgencyLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgencyLevel record);

    int insertSelective(AgencyLevel record);

    AgencyLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgencyLevel record);

    int updateByPrimaryKey(AgencyLevel record);
}