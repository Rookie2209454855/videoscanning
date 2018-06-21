package com.video.scanning.entity;

public class HostDisk {
    private Integer id;

    private String name;

    private String diskcode;

    private Integer hostserveid;

    private String version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDiskcode() {
        return diskcode;
    }

    public void setDiskcode(String diskcode) {
        this.diskcode = diskcode == null ? null : diskcode.trim();
    }

    public Integer getHostserveid() {
        return hostserveid;
    }

    public void setHostserveid(Integer hostserveid) {
        this.hostserveid = hostserveid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }
}