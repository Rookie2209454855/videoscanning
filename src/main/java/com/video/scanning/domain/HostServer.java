package com.video.scanning.domain;


import lombok.*;

/*服务主机实体*/
@ToString
@Data
/*Data 为类提供无参构造方法*/
@NoArgsConstructor
@AllArgsConstructor
public class HostServer{

    @NonNull
    private Integer id;/*主机id*/

    private String name;//主机名

    private String ipAdress;//主机ip地址

    private String port;//主机端口

    private String version;//描述

}
