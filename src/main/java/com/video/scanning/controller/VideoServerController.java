package com.video.scanning.controller;

import com.video.scanning.domain.VideoIP;
import com.video.scanning.service.VideoIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengtiepeng on 2017/10/10.
 *
 * 扫描配置页面
 * 配置文件主机，端口
 */
@RestController
@RequestMapping("/v1")
public class VideoServerController {

    @Autowired
    private VideoIPService videoIPService;


    /***
     * 添加IP服务
     * @param videoIP
     * @return
     */
    @RequestMapping(value="/addIpServer",method= RequestMethod.POST)
    public Integer addIpServer(@RequestBody VideoIP videoIP){
        return videoIPService.addIpServer(videoIP);
    }




}
