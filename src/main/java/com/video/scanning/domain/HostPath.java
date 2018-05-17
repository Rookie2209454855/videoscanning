package com.video.scanning.domain;

import lombok.*;

@ToString
@Data
/*Data 为类提供无参构造方法*/
@NoArgsConstructor
@AllArgsConstructor
public class HostPath{

    @NonNull
    private Integer id;

    private String route;

    private String describe;

    private Integer fileId;

    private String version;

}
