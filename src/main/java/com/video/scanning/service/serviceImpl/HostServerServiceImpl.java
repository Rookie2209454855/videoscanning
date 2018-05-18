package com.video.scanning.service.serviceImpl;


import com.video.scanning.dao.HostServerDao;
import com.video.scanning.domain.HostServer;
import com.video.scanning.service.HostServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServerServiceImpl implements HostServerService {

    @Autowired
    private HostServerDao hostServerDao;

    public Integer addHostServer(HostServer hostServer){
        return hostServerDao.addHostServer(hostServer);
    };

    public Integer updateHostServer(HostServer hostServer){
        return hostServerDao.updateHostServer(hostServer);
    };

    public Integer delHostServer(Integer id){

        return hostServerDao.delHostServer(id);
    };

    public List<HostServer> selHostServers(HostServer hostServer){
        return hostServerDao.selHostServers(hostServer);
    };

    public HostServer selHostServer(Integer id){
        return hostServerDao.selHostServer(id);
    };

}
