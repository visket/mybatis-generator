package com.fg.cloud.manager.mapper;

import com.fg.cloud.manager.entry.AgencyCart;

public interface AgencyCartMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgencyCart record);

    int insertSelective(AgencyCart record);

    AgencyCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgencyCart record);

    int updateByPrimaryKey(AgencyCart record);
}