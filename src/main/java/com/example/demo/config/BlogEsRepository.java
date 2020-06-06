package com.example.demo.config;

import com.example.demo.model.BlogModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fuqiangxin
 * @Classname: BlogEsRepository
 * @Description:
 * @date 2020/6/2 15:38
 */
@Repository
public interface BlogEsRepository extends ElasticsearchRepository<BlogModel, Integer> {

    List<BlogModel> findByTitleLike(String title);
}
