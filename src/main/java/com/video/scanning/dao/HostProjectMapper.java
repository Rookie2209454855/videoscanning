package com.video.scanning.dao;

import com.video.scanning.entity.HostProject;

public interface HostProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HostProject record);

    int insertSelective(HostProject record);

    HostProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HostProject record);

    int updateByPrimaryKey(HostProject record);
}