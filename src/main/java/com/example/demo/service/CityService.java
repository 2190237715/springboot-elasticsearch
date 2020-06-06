package com.example.demo.service;

import com.example.demo.model.CityModel;

/**
 * @author fuqiangxin
 * @Classname: CityService
 * @Description:
 * @date 2020/6/2 09:22
 */
public interface CityService {
    CityModel saveCity(CityModel cityModel);

    CityModel findCityById(int id);
}
