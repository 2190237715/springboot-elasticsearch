package com.example.demo.service.impl;

import com.example.demo.model.CityModel;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fuqiangxin
 * @Classname: CityServiceImpl
 * @Description:
 * @date 2020/6/2 09:24
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityRepository cityRepository;

    @Override
    public CityModel saveCity(CityModel cityModel) {
        return null;
    }

    @Override
    public CityModel findCityById(int id) {
        return cityRepository.findById(id).get();
    }
}
