package com.rbgt.mb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rbgt.mb.enums.Status;
import lombok.*;

/**
 * @project_name: mb
 * @package_name: com.rbgt.mb.dto
 * @name: TestDto
 * @author: 俞春旺
 * @date: 2020/4/4 20:54
 * @day_name_full: 星期六
 * @remark: 无
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class TestDto {
    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private Status status;
}
