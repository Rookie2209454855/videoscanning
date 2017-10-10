package com.video.scanning.domain;

/**
 * Created by fengtiepeng on 2017/10/10.
 */
public class VideoIP {

    private Long id;
    private String ip;
    private String des;//描述

    @Override
    public String toString() {
        return "VideoIP{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public VideoIP() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
