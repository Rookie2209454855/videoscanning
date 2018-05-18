package com.video.scanning.service.serviceImpl;

import com.video.scanning.dao.VideoIPDao;
import com.video.scanning.domain.VideoIP;
import com.video.scanning.service.VideoIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengtiepeng on 2017/10/10.
 */
@Service
public class VideoIPServiceImpl implements VideoIPService {

    @Autowired
    private VideoIPDao videoIPDao;

    @Override
    public Integer addIpServer(VideoIP videoIP) {
        return videoIPDao.addIpServer(videoIP);
    }

}
