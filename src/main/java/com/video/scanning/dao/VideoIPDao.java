package com.video.scanning.dao;


import com.video.scanning.domain.VideoIP;
import org.apache.ibatis.annotations.Param;

/**
 * Created by fengtiepeng on 2017/10/10.
 */
public interface VideoIPDao {

    Integer addIpServer(@Param("videoIP") VideoIP videoIP);

}
