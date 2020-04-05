package com.rbgt.mb.respons;

/**
 * @project_name: mb
 * @package_name: com.rbgt.mb.respons
 * @name: ResponseResult
 * @author: 俞春旺
 * @date: 2020/4/5 10:49
 * @day_name_full: 星期日
 * @remark: 无
 **/
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一的公共响应体
 * @author NULL
 * @date 2019-07-16
 */
@Data
@AllArgsConstructor
public class ResponseResult implements Serializable {
    /**
     * 返回状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

}
