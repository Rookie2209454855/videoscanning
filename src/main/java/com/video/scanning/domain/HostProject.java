package com.video.scanning.domain;

import lombok.*;

@ToString
@Data
/*Data 为类提供无参构造方法*/
@NoArgsConstructor
@AllArgsConstructor
public class HostProject {

    @NonNull
    private Integer id;

    private String name;

    private Integer diskId;

    private String version;

}
