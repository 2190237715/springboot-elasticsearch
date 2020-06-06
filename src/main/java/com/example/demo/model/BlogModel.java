package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author fuqiangxin
 * @Classname: BlogModel
 * @Description:
 * @date 2020/6/2 15:37
 */
@Data
@Entity
@Table(name = "blog")
@Document(indexName = "practice")
@Accessors(chain = true)
public class BlogModel implements Serializable {

    private static final long serialVersionUID = 6320548148250372657L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    //@Field(type = FieldType.Date, format = DateFormat.basic_date)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date time;
}
