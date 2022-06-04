package com.jiaruiblog.controller;

import com.jiaruiblog.entity.Tag;
import com.jiaruiblog.utils.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CategoryController
 * @Description TODO
 * @Author luojiarui
 * @Date 2022/6/4 3:10 下午
 * @Version 1.0
 **/
@Api(tags = "文档分类模块")
@RestController
@Slf4j
@RequestMapping("/category")
public class CategoryController {

    @ApiOperation(value = "新增单个标签", notes = "新增单个标签")
    @PostMapping(value = "/insert")
    public ApiResult insertTag(@RequestBody Tag tag){
        return ApiResult.success("新增成功");
    }

    @ApiOperation(value = "更新标签", notes = "更新标签")
    @PostMapping(value = "/update")
    public ApiResult updateTag(@RequestBody Tag tag){
        return ApiResult.success("新增成功");
    }

    @ApiOperation(value = "根据id移除某个标签", notes = "根据id移除某个标签")
    @PostMapping(value = "/remove")
    public ApiResult removeTag(@RequestBody Tag tag){
        return ApiResult.success("新增成功");
    }

    @ApiOperation(value = "根据id查询某个标签", notes = "根据id查询某个标签")
    @PostMapping(value = "/queryById")
    public ApiResult queryById(@RequestBody Tag tag){
        return ApiResult.success("新增成功");
    }

    @ApiOperation(value = "根据关键字检索标签", notes = "检索标签")
    @PostMapping(value = "/search")
    public ApiResult search(@RequestBody Tag tag){
        return ApiResult.success("新增成功");
    }


}