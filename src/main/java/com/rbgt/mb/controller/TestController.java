package com.rbgt.mb.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import com.baomidou.mybatisplus.plugins.Page;
import com.rbgt.mb.domain.Test;
import com.rbgt.mb.service.ITestService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenxiaoqing
 * @since 2020-04-04
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService baseService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return Test
    */
    @GetMapping("/{id}")
    public Test get(@PathVariable String id){
        return baseService.selectById(id);
    }


    /**
    * 分页查询信息
    *
    * @return 分页对象
    */
    @PostMapping("/page")
    public Page<Test> page(Page<Test> entityPage, Test entity){
        Page<Test> page = baseService.selectPage(entityPage);
        return page;
    }

    /**
    * 添加
    * @param  test 实体
    * @return success/false
    */
    @PostMapping
    public Boolean add(@RequestBody Test test){
        return baseService.insert(test);
    }

    /**
    * 删除
    * @param id ID
    * @return success/false
    */
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable String id){
        Test test = new Test();
        test.setId(id);
        return baseService.updateById(test);
    }

    /**
    * 编辑
    * @param  test 实体
    * @return success/false
    */
    @PutMapping
    public Boolean edit(@RequestBody Test test){
        return baseService.updateById(test);
    }
}