package com.rbgt.mb.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MyIreland
 */
@Configuration // 容器配置，主要使用MP的分页插件
@MapperScan("com.yiautos.microstore.**.mapper") // 指定扫描Mapper包路径，这样就不用每个Mapper文件添加@Mapper注解
public class MybatisPlusConfig {
    /**
     * 分页插件
     *
     * @return PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * 数据权限插件
     *
     * @return DataScopeInterceptor
     */
//    @Bean
//    public DataScopeInterceptor dataScopeInterceptor() {
//        return new DataScopeInterceptor();
//    }

    /**
     * 打印 sql
     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor =new PerformanceInterceptor();
//        //格式化sql语句
//        Properties properties =new Properties();
//        properties.setProperty("format", "false");
//        performanceInterceptor.setProperties(properties);
//
//        return performanceInterceptor;
//
//    }
}