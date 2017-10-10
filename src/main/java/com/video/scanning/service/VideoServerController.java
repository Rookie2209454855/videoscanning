package com.video.scanning.service;

import com.video.scanning.dao.VideoIPDao;
import com.video.scanning.domain.VideoIP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fengtiepeng on 2017/10/10.
 */
@RestController
@RequestMapping("/v1")
public class VideoServerController {

    @Autowired
    private VideoIPDao videoIPDao;


    /***
     * 添加IP服务
     * @param videoIP
     * @return
     */
    @RequestMapping(value="/addIpServer",method= RequestMethod.POST)
    public Integer addIpServer(@RequestBody VideoIP videoIP){
        return videoIPDao.addIpServer(videoIP);
    }
}
