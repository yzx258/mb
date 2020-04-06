package com.rbgt.mb.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.rbgt.mb.domain.User;
import com.rbgt.mb.mapper.UserMapper;
import com.rbgt.mb.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 4096 kB 服务实现类
 * </p>
 *
 * @author chenxiaoqing
 * @since 2020-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
