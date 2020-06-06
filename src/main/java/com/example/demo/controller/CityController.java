package com.example.demo.controller;

import com.example.demo.model.CityModel;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuqiangxin
 * @Classname: CityController
 * @Description:
 * @date 2020/6/2 09:27
 */
@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @GetMapping("/findCityModel/{id}")
    public CityModel findCityModel(@PathVariable(name = "id") int id) {
        CityModel cityModel = cityService.findCityById(id);
        return cityModel;
    }
}
