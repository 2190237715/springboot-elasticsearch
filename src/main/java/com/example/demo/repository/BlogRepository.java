package com.example.demo.repository;

import com.example.demo.model.BlogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author fuqiangxin
 * @Classname: BlogRepository
 * @Description:
 * @date 2020/6/2 15:38
 */
@Repository
public interface BlogRepository extends JpaRepository<BlogModel, Integer> {

}
