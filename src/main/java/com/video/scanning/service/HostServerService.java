package com.video.scanning.service;

import com.video.scanning.domain.HostServer;

import java.util.List;


public interface HostServerService {

    Integer addHostServer(HostServer hostServer);

    Integer updateHostServer(HostServer hostServer);

    Integer delHostServer(Integer id);

    List<HostServer> selHostServers(HostServer hostServer);

    HostServer selHostServer(Integer id);
}
