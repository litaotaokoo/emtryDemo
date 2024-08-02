package org.example.config;


import org.example.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//添加扫描组件，扫描com.rf.bean下的所有
@ComponentScan("org.example.bean")
public class MyConfig {

    @Bean()
    public Car car(){
        return new Car();
    }
}


