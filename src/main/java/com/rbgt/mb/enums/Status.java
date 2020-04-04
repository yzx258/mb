package com.rbgt.mb.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.*;

/**
 * @project_name: mb
 * @package_name: com.rbgt.mb.enums
 * @name: Status
 * @author: 俞春旺
 * @date: 2020/4/4 20:56
 * @day_name_full: 星期六
 * @remark: 无
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonFormat(shape = Shape.OBJECT)
public enum Status {

    OFFLINE(0, "直播未开始"),
    ONLINE(1, "直播中"),
    OVER(2, "直播已结束");

    private int code;
    private String name;

}
