package com.example.demo.service;

import com.example.demo.model.BlogModel;

import java.util.List;


/**
 * @author fuqiangxin
 * @Classname: BlogService
 * @Description:
 * @date 2020/6/2 15:41
 */
public interface BlogService {
    BlogModel saveBlogModel(BlogModel blogModel);

    Iterable<BlogModel> findAllBlogModel();

    BlogModel findBlogModelById(int id);

    void deleteBlogModel(int id);

    BlogModel updateBlogModel(BlogModel blogModel);

    List<BlogModel> findByTitleLike(String title);
}
