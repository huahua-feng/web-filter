package com.feng.demo;

import com.feng.demo.filter.SecFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;
import java.util.ArrayList;
import java.util.Collection;

@ServletComponentScan
@SpringBootApplication
public class FilterMain {

    /*@Bean
    public FilterRegistrationBean<Filter> secFilter() {
        FilterRegistrationBean<Filter> filter = new FilterRegistrationBean<>();
        filter.setName("orderFilter");
        filter.setFilter(new SecFilter());

        Collection<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        filter.setUrlPatterns(urlPatterns);
        filter.setOrder(99);
        return filter;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(FilterMain.class, args);
    }
}
