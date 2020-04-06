package com.rbgt.mb.mapper;

import com.rbgt.mb.domain.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.rbgt.mb.dto.UserDto;

import java.util.List;

/**
 * <p>
 * InnoDB free: 4096 kB Mapper 接口
 * </p>
 *
 * @author chenxiaoqing
 * @since 2020-04-06
 */
public interface UserMapper extends BaseMapper<User> {

    List<UserDto> selectMb();

}
