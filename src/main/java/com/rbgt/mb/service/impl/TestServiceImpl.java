package com.rbgt.mb.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbgt.mb.domain.Test;
import com.rbgt.mb.mapper.TestMapper;
import com.rbgt.mb.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenxiaoqing
 * @since 2020-04-04
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
