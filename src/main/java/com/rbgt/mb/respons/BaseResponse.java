package com.rbgt.mb.respons;

/**
 * @project_name: mb
 * @package_name: com.rbgt.mb.respons
 * @name: BaseResponse
 * @author: 俞春旺
 * @date: 2020/4/5 10:50
 * @day_name_full: 星期日
 * 统一响应注解<br/>
 * 添加注解后，统一响应体才能生效
 **/
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface BaseResponse {

}