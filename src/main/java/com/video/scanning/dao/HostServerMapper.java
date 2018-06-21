package com.video.scanning.dao;

import com.video.scanning.entity.HostServer;

public interface HostServerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HostServer record);

    int insertSelective(HostServer record);

    HostServer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HostServer record);

    int updateByPrimaryKey(HostServer record);
}