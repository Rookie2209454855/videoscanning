package com.video.scanning.domain;

import lombok.*;

@ToString
@Data
/*Data 为类提供无参构造方法*/
@NoArgsConstructor
@AllArgsConstructor
public class HostFile extends HostPage{

    @NonNull
    private Integer id;

    private String name;

    private String type;

    private Integer projectId;

    private String version;

    private String filePath;

    private String describe;

}
