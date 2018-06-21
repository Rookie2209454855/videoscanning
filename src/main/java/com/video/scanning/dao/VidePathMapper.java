package com.video.scanning.dao;

import com.video.scanning.entity.VidePath;

public interface VidePathMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VidePath record);

    int insertSelective(VidePath record);

    VidePath selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VidePath record);

    int updateByPrimaryKey(VidePath record);
}