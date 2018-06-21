package com.video.scanning.dao;

import com.video.scanning.entity.HostFile;

public interface HostFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HostFile record);

    int insertSelective(HostFile record);

    HostFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HostFile record);

    int updateByPrimaryKey(HostFile record);
}