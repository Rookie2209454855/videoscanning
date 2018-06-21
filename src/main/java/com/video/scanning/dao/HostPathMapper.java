package com.video.scanning.dao;

import com.video.scanning.entity.HostPath;

public interface HostPathMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HostPath record);

    int insertSelective(HostPath record);

    HostPath selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HostPath record);

    int updateByPrimaryKey(HostPath record);
}