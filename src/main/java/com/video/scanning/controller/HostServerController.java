package com.video.scanning.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.video.scanning.domain.HostServer;
import com.video.scanning.service.HostServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hs")
public class HostServerController {

    @Autowired
    private HostServerService hostServerService;

    @RequestMapping(value = "/showHostServers",method = RequestMethod.POST)
    public JSONArray showHostServers(@RequestBody HostServer hostServer){
        return JSON.parseArray(JSON.toJSONString(hostServerService.selHostServers(hostServer)));
    }

    @RequestMapping(value = "/addHostServers",method = RequestMethod.POST)
    public Integer addHostServers(@RequestBody HostServer hostServer){
        return hostServerService.addHostServer(hostServer);
    }

}
