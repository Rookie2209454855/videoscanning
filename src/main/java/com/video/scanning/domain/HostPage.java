package com.video.scanning.domain;

import lombok.Data;

@Data
public abstract class HostPage {

    private Integer pageNo;

    private Integer pageSize;

    private Integer nodeCount;


}
