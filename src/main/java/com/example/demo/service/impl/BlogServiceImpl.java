package com.example.demo.service.impl;

import com.example.demo.model.BlogModel;
import com.example.demo.config.BlogEsRepository;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fuqiangxin
 * @Classname: BlogServiceImpl
 * @Description:
 * @date 2020/6/2 15:45
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private BlogEsRepository blogEsRepository;

    @Override
    public BlogModel saveBlogModel(BlogModel blogModel) {
        BlogModel blogVo = blogRepository.save(blogModel);
        blogEsRepository.save(blogVo);
        return blogVo;
    }

    @Override
    public Iterable<BlogModel> findAllBlogModel() {
        blogEsRepository.findAll();
        return blogRepository.findAll();
    }

    @Override
    public BlogModel findBlogModelById(int id) {
        blogEsRepository.findById(id).get();
        return blogRepository.findById(id).get();
    }

    @Override
    public void deleteBlogModel(int id) {
        blogEsRepository.deleteById(id);
        blogRepository.deleteById(id);
    }

    @Override
    public BlogModel updateBlogModel(BlogModel blogModel) {
        blogEsRepository.save(blogModel);
        return blogRepository.save(blogModel);
    }

    @Override
    public List<BlogModel> findByTitleLike(String title) {
        return blogEsRepository.findByTitleLike(title);
    }
}
