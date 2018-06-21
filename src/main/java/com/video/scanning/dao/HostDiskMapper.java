package com.video.scanning.dao;

import com.video.scanning.entity.HostDisk;

public interface HostDiskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HostDisk record);

    int insertSelective(HostDisk record);

    HostDisk selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HostDisk record);

    int updateByPrimaryKey(HostDisk record);
}