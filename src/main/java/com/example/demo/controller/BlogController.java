package com.example.demo.controller;

import com.example.demo.model.BlogModel;
import com.example.demo.service.BlogService;
import com.example.demo.util.HttpStatusEnum;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fuqiangxin
 * @Classname: BlogController
 * @Description:
 * @date 2020/6/2 15:46
 */
@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;



    @PostMapping("/saveBlogModel")
    public Result saveBlogModel(@RequestBody BlogModel blogModel) {
        BlogModel blogVo =  blogService.saveBlogModel(blogModel);
        return Result.success(blogVo);
    }

    @DeleteMapping("/deleteBlogModel/{id}")
    public Result deleteBlogModel(@PathVariable int id) {
        blogService.deleteBlogModel(id);
        return Result.success();
    }

    @PutMapping("/updateBlogModel")
    public Result updateBlogModel(@RequestBody BlogModel blogModel) {
        BlogModel blogVo =   blogService.updateBlogModel(blogModel);
        return Result.success(blogVo);
    }

    @GetMapping("/findAllBlogModel")
    public Result findAllBlogModel() {
        Iterable<BlogModel> iterator = blogService.findAllBlogModel();
        List<BlogModel> list = new ArrayList<>(500);
        iterator.forEach(list::add);
        return Result.success(list);
    }

    @GetMapping("/findBlogModelById/{id}")
    public Result findBlogModelById(@PathVariable int id) {
        if (StringUtils.isEmpty(id))
            return Result.fail(HttpStatusEnum.GONE);
        BlogModel blogModel = blogService.findBlogModelById(id);
        return Result.success(blogModel);
    }

    @GetMapping("/repSearchTitle")
    public Result repSearchTitle(@RequestParam String  title) {
        if (StringUtils.isEmpty(title))
            return Result.fail(HttpStatusEnum.GONE);
        Iterable<BlogModel> iterator =  blogService.findByTitleLike(title);
        List<BlogModel> list = new ArrayList<>(500);
        iterator.forEach(list::add);
        return Result.success(list);
    }
}
