package com.video.scanning.dao;

import com.video.scanning.entity.VideoDisk;

public interface VideoDiskMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(VideoDisk record);

    int insertSelective(VideoDisk record);

    VideoDisk selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(VideoDisk record);

    int updateByPrimaryKey(VideoDisk record);
}