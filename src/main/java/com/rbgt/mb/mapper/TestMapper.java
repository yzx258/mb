package com.rbgt.mb.mapper;

import com.rbgt.mb.domain.Test;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rbgt.mb.dto.TestDto;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenxiaoqing
 * @since 2020-04-04
 */
public interface TestMapper extends BaseMapper<Test> {

    List<TestDto> selectMb();
}
