package com.example.demo.repository;

import com.example.demo.model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fuqiangxin
 * @Classname: CityRepository
 * @Description:
 * @date 2020/6/2 09:21
 */
@Repository
public interface CityRepository extends JpaRepository<CityModel, Integer> {
}
