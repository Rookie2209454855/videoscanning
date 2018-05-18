package com.video.scanning.dao;


import com.video.scanning.domain.HostServer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*服务主机接口*/
public interface HostServerDao {

    Integer addHostServer(@Param("hostServer") HostServer hostServer);

    Integer updateHostServer(@Param("hostServer") HostServer hostServer);

    Integer delHostServer(@Param("id") Integer id);

    List<HostServer> selHostServers(@Param("hostServer") HostServer hostServer);

    HostServer selHostServer(@Param("id") Integer id);


}
