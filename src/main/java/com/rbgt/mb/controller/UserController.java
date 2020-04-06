package com.rbgt.mb.controller;
import com.rbgt.mb.dto.UserDto;
import com.rbgt.mb.mapper.UserMapper;
import com.rbgt.mb.respons.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.plugins.Page;
import com.rbgt.mb.domain.User;
import com.rbgt.mb.service.IUserService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 4096 kB 前端控制器
 * </p>
 *
 * @author chenxiaoqing
 * @since 2020-04-06
 */
@Slf4j
@BaseResponse
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService baseService;

    @Autowired
    private UserMapper mp;
    /**
    * 通过ID查询
    *
    * @param id ID
    * @return User
    */
    @GetMapping("/{id}")
    public List<UserDto> get(@PathVariable String id){
        List<UserDto> userDtos = mp.selectMb();
        System.out.println(userDtos.toString());
        return userDtos;
    }


    /**
    * 分页查询信息
    *
    * @return 分页对象
    */
    @PostMapping("/page")
    public Page<User> page(Page<User> entityPage, User entity){
        Page<User> page = baseService.selectPage(entityPage);
        return page;
    }

    /**
    * 添加
    * @param  user 实体
    * @return success/false
    */
    @PostMapping
    public Boolean add(@RequestBody User user){
        return baseService.insert(user);
    }

    /**
    * 删除
    * @param id ID
    * @return success/false
    */
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable String id){
        User user = new User();
        user.setId(id);
        return baseService.updateById(user);
    }

    /**
    * 编辑
    * @param  user 实体
    * @return success/false
    */
    @PutMapping
    public Boolean edit(@RequestBody User user){
        return baseService.updateById(user);
    }
}
