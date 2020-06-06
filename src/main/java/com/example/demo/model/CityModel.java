package com.example.demo.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;

/**
 * @author fuqiangxin
 * @Classname: CityModel
 * @Description:
 * @date 2020/6/2 09:14
 */
@Data
@Entity
@Table(name = "city")
@Document(indexName = "CityModel")
public class CityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "province_id")
    private int provinceId;
    @Column(name = "city_name")
    private String cityName;
    private String description;
}
