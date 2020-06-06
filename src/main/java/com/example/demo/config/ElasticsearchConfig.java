package com.example.demo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @author fuqiangxin
 * @Classname: ElasticsearchConfig
 * @Description: elasticsearch配置类
 * @date 2020/6/2 15:01
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.demo.repository",
        includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                value = ElasticsearchRepository.class))
public class ElasticsearchConfig {
    @Bean
    RestHighLevelClient elasticsearchClient() {
        ClientConfiguration configuration = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                //.withConnectTimeout(Duration.ofSeconds(5))
                //.withSocketTimeout(Duration.ofSeconds(3))
                //.useSsl()
                //.withDefaultHeaders(defaultHeaders)
                //.withBasicAuth(username, password)
                // ... other options
                .build();
        RestHighLevelClient client = RestClients.create(configuration).rest();

        return client;
    }
}
